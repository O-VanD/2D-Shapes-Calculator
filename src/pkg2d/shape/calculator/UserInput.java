/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.shape.calculator;

import java.util.Scanner;
/**
 *
 * @author Owen
 */
public class UserInput {
    
    Scanner input = new Scanner(System.in);
        
    public void Start(){
        boolean validEntry = false;
        
        System.out.println("This is a calculator that find the area or perimeter"
                + " of rectangles, circles and triangles.");
        System.out.println("Enter the number of the desired option:");
        System.out.println("1. Rectangle \n2. Triangle \n3. Circle");
        int shape = input.nextInt();

        while(!validEntry){
            UserInput pickShape = new UserInput();
            switch(shape) {
                case 1: pickShape.rectangleShape();
                validEntry = true;
                break;
             
                case 2: pickShape.triangleShape();
                validEntry = true;
                break;
                
                case 3: pickShape.circleShape();
                validEntry = true;
                break;
                
                default: System.out.println("Please enter a number that aligns with"
                        + "one of the options");
                
            }    
        }
    }    
    
    public void rectangleShape(){
        boolean validInput = false;
        System.out.print("What is the length: ");
        double l = input.nextDouble();
        System.out.print("What is the height: ");
        double h = input.nextDouble();
        
        Rectangle rectangle = new Rectangle(l,h);
        
        System.out.println("Would you like to:");
        System.out.print("1. Find the area \n2. Find the perimemter \n");
        int find = input.nextInt();

        while (!validInput){
            switch(find) {
                case 1: System.out.println("The area of the reactangle is " + rectangle.getArea());
                validInput = true;
                break;
                
                case 2: System.out.println("The perimemter of the rectangle is " +rectangle.getPerimeter());
                validInput = true;
                break;
                
                default: System.out.println("Please enter a valid number based on the options above");
            }
        }
    }
    
    public void triangleShape(){
        boolean validInput = false;
        System.out.print("What is the base: ");
        double b = input.nextDouble();
        System.out.print("What is the height: ");
        double h = input.nextDouble();
        System.out.print("What is the first side length: ");
        double s1 = input.nextDouble();
        System.out.print("What is the second side length: ");
        double s2 = input.nextDouble();
        
        Triangle triangle = new Triangle(b,h,s1,s2);
        
        System.out.println("Would you like to:");
        System.out.print("1. Find the area \n2. Find the perimemter \n");
        int find = input.nextInt();

        while (!validInput){
            switch(find) {
                case 1: System.out.println("The area of the triangle is " + triangle.getArea());
                validInput = true;
                break;
                
                case 2: System.out.println("The perimemter of the triangle is " +triangle.getPerimeter());
                validInput = true;
                break;
                
                default: System.out.println("Please enter a valid number based on the options above");
            }
        }        
    }
    
    public void circleShape(){
        boolean validInput = false;
        System.out.print("What is the radius: ");
        double r = input.nextDouble();
        
        
        Circle circle = new Circle(r);
        
        System.out.println("Would you like to:");
        System.out.print("1. Find the area \n2. Find the perimemter \n");
        int find = input.nextInt();

        while (!validInput){
            switch(find) {
                case 1: System.out.println("The area of the circle is " + circle.getArea());
                validInput = true;
                break;
                
                case 2: System.out.println("The perimemter of the circle is " +circle.getPerimeter());
                validInput = true;
                break;
                
                default: System.out.println("Please enter a valid number based on the options above");
            }
        }
    }
}
