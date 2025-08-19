//ABSTRACTION
 
import java.io.*;
import java.util.*;

abstract class Shape{
	String name;
	
	Shape(String name){
		this.name = name ;
	}
	
	abstract double calculateArea();

}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		super("Circle");
		this.radius = radius;
	}
	
	
	public double calculateArea(){
		return Math.PI*radius*radius;
	}
}

class Rectangle extends Shape{
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public double calculateArea(){
		return length*breadth;
	}
}

class Square extends Shape{
	double side;
	
	Square(double side){
		super("Square");
		this.side = side;
	}
	
	
	public double calculateArea(){
		return side*side;
	}
}

public class main{
	public static void main(String args[]){
		Circle cr = new Circle(5);
		Rectangle rec = new Rectangle(5,5);
		Square sq = new Square(5);
		System.out.println("Area of Circle : "+cr.calculateArea());
		System.out.println("Area of Rectangle : "+rec.calculateArea());
		System.out.println("Area of Square : "+sq.calculateArea());
	}
}
	 