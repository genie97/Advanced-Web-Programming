package myPackage;

import java.util.*;

public class Car {
	private String model, maker;
	private int year;
	private static HashMap<String, String> cars;

	public Car() {
	}

	public Car(String model, int year, String maker) {
		this.model = model;
		this.year = year;
		this.maker = maker;
	}

	public void printInfo() {
		System.out.println("Model: " + this.model + " Year: " + this.year + " Maker: " + this.maker);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void setCars() {
		cars = new HashMap<String, String>();
		cars.put("Sonata", "Hyundai");
		cars.put("K3", "Kia");
		cars.put("X5", "BMW");
	}

	public static String getCars(String model) {
		return cars.get(model);
	}
}
