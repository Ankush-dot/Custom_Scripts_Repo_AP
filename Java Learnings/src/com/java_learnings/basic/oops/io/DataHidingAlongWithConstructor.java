package com.java_learnings.basic.oops.io;

class Cylinder
{
	private double radius;
	private double height;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
		radius = 1;
		height = 1;
	}
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	

	public Cylinder(double s){
		s= radius+height;
	}
	
	public double size() {
		return getHeight()*getRadius();
		
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
   

public class DataHidingAlongWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cy = new Cylinder();
		cy.setRadius(10);
		cy.setRadius(8);
		System.out.println("Radius value is  "+ cy.getRadius());
		System.out.println("height value is  "+ cy.getHeight());
		System.out.println(cy.size());
	}

}
