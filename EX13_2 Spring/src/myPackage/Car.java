package myPackage;

import java.util.*;

public class Car {
	private String model, maker;
	private int year;
	private static HashMap<String, String> car;

	public Car() {}

	public Car(String model, int year, String maker) {
		this.model = model;
		this.year = year;
		this.maker = maker;
	}

	public void printInfo() {
		System.out.printf("Model: %s\nYear: %d\nMaker: %s\n", model, year, maker);
	}

	public static void setCar() {
		car = new HashMap<String, String>();
		car.put("Sonata", "Hyundai");
		car.put("K3", "Kia");
		car.put("X5", "BMW");
	}

	public static String getCar(String model) {
		return car.get(model);
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
}
