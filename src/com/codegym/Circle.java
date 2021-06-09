package com.codegym;

public class Circle extends Shape{
    double radius = 1.0;


    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

//get trả về return this.width
    public double getRadius(){
        return this.radius;

    }
    public void setRadius(double radius){
        this.radius =radius;
    }
    public  double getArea(){
        return radius*radius*Math.PI;

    }
    public double getPerimeter(){
        return 2*radius*Math.PI;

    }
    public String toString(){
        return "a circle with radius= "
                + getColor()
                + ", which is a subclass of "
                + super.toString();
    }
}
