package com.codegym;

public class Main {

    public static void main(String[] args) {
        //lớp shape
//	Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red",false);
//        System.out.println(shape);


        //lớp circle
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5,"indigo",false);
//        System.out.println(circle);
//
//        System.out.println("Area: "+circle.getArea());
//        System.out.println("Perimeter: "+circle.getPerimeter());
//
//

//        //lớp rectangle
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.5, 3.8,"origin",true);
//        System.out.println(rectangle);
//        System.out.println("Area: "+rectangle.getArea());
//        System.out.println("Perimeter: "+rectangle.getPerimeter());


        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
