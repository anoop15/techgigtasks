package com.sikuli;
public class vehicle { 
 
 public static void main(String[] args) {
                //Create 2 objects of class. Both have different reference variables.
	 vehicle car =new vehicle("blue","auto", 900000, 180,4.0);
	 vehicle bicycle = new vehicle("black", 2, 4500, 3.7);
  vehicle motorcycle = new vehicle("Blue", 2, 67000, 74.6);
 

 }
 public vehicle(String color,String type, int wheels, int price, double speed){
	 System.out.println("Color = "+color+", Type = "+type+", Wheels = "+wheels+", Price = "+price+", Speed = "+speed);
 }
 public vehicle(String color, int wheels, int price, double speed){
	 System.out.println("Color = "+color+", Wheels = "+wheels+", Price = "+price+", Speed = "+speed);
 } 
 
}