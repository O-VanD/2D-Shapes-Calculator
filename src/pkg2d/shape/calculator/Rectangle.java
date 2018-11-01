/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.shape.calculator;

/**
 *
 * @author Owen
 */
public class Rectangle implements Calculator {
    double length;
    double height;
    
    Rectangle(double l, double h){
        length = l;
        height = h;
    }

    @Override
    public double getArea() {
        return (length * height);
    }

    @Override
    public double getPerimeter() {
        //For the sake of efficiency the variables side1 and side2 are being used
        //to represent the length and width of a reactangle
        return ((2 * length) + (2 * height));
    }
    
}
