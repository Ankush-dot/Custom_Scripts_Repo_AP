package com.java_learnings.basics.io;

import java.util.Objects;

class laptop
{
	public String model;
	public int price;

	
	@Override
	public String toString() {
		return "laptop [model=" + model + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		laptop other = (laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	
	
}

public class JavaObjectClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		laptop lap = new laptop();
		laptop lap1 = new laptop();
		
		lap.model = "Macbook M1";
		lap.price = 134000;
		
		lap1.model = "Macbook M1";
		lap1.price = 134000;
		
		boolean result = lap.equals(lap1);
		
		System.out.println(lap.toString()); //ByDefualt it call toString method whenever we tried to print objects.
		System.out.println(result);
	}

}
