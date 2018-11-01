/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.shape.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Owen
 */
public class UserInput {
    
    Scanner input;
    DecimalFormat format;

    public UserInput() {
        this.input = new Scanner(System.in);
        this.format = new DecimalFormat("#.##");
    }
        
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
        boolean isDone = false;
        
        System.out.print("\nWhat is the length: ");
        double l = input.nextDouble();
        System.out.print("What is the height: ");
        double h = input.nextDouble();
        
        Rectangle rectangle = new Rectangle(l,h);
        
        

        while (!isDone){
            System.out.println("\nWould you like to:");
            System.out.print("1. Find the area \n2. Find the perimemter \n3. Quit \n");
            int find = input.nextInt();
            
            switch(find) {
                case 1: System.out.println("The area of the reactangle is " + format.format(rectangle.getArea()));
                break;
                
                case 2: System.out.println("The perimemter of the rectangle is " + format.format(rectangle.getPerimeter()));
                break;
                
                case 3: isDone = true;
                break;
                
                default: System.out.println("Please enter a valid number based on the options above");
            }
        }
    }
    
    public void triangleShape(){
        boolean isDone = false;
        
        System.out.print("\nWhat is the base: ");
        double b = input.nextDouble();
        System.out.print("What is the height: ");
        double h = input.nextDouble();
        System.out.print("What is the first side length: ");
        double s1 = input.nextDouble();
        System.out.print("What is the second side length: ");
        double s2 = input.nextDouble();
        
        Triangle triangle = new Triangle(b,h,s1,s2);
        
        while (!isDone){
            System.out.println("\nWould you like to:");
            System.out.print("1. Find the area \n2. Find the perimemter \n3. Quit \n");
            int find = input.nextInt();
            
            switch(find) {
                case 1: System.out.println("The area of the triangle is " + format.format(triangle.getArea()));
                break;
                
                case 2: System.out.println("The perimemter of the triangle is " + format.format(triangle.getPerimeter()));
                break;
                
                case 3: isDone = true;
                
                default: System.out.println("Please enter a valid number based on the options above");
            }
        }        
    }
    
    public void circleShape(){
        System.out.print("\nWhat is the radius: ");
        double r = input.nextDouble();
        boolean isDone = false;
        
        Circle circle = new Circle(r);
        
        while (!isDone){
            System.out.println("\nWould you like to:");
            System.out.print("1. Find the area \n2. Find the perimemter \n3. Quit \n");
            int find = input.nextInt();
            
            switch(find) {
                case 1: System.out.println("The area of the circle is " + format.format(circle.getArea()));
                break;
                
                case 2: System.out.println("The perimemter of the circle is " + format.format(circle.getPerimeter()));
                break;
                
                case 3: isDone = true;
                break;
                
                default: System.out.println("Please enter a valid number based on the options above");
            }
        }
    }
}
