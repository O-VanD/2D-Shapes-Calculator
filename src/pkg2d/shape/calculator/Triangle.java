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
public class Triangle implements Calculator {
    double base;
    double height;
    double side1;
    double side2;
    
    Triangle(double b, double h, double s1, double s2){
        base = b;
        height = h;
        side1 = s1;
        side2 = s2;
    }

    @Override
    public double getArea() {
        return (base * height / 2);
    }

    @Override
    public double getPerimeter() {
        return (base + side1 + side2);
    }    
}
