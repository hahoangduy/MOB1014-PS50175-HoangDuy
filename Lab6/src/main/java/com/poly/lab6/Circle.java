/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab6;

/**
 *
 * @author DELL
 */
public class Circle {
    protected double radius;
    protected String color;

    public Circle() {
        radius = 1.0;
        color = "Trang";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        if (radius < 0)
            System.out.println("Ban kinh khong hop le");
        else 
            this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Hinh tron " + 
                "[ban kinh=" + radius +
                ", mau=" + color + 
                ", chu vi=" + getPerimeter() +
                ", dien tich=" + getArea() + "]";
    }
    
    
}
