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
public class Circle implements Calculator {
    double radius;
    
    Circle(double r){
        radius = r;        
    }
    
    @Override
    public double getArea() {
        //For the sake of efficiency all the variable length is being reused
        //as the radius of a circle
        return (radius * radius * Math.PI);
    }

    @Override
    public double getPerimeter() {
        //For the sake of efficiency all the variable side 1 is being reused 
        //as the raduis of a circle
        return (2 * radius * Math.PI);
    }
    
}
