package myPackage;

import java.util.List;

public class CarFactory {

	public static Car makeCar(String model, int year) {
		return new Car(model, year, Car.getCars(model));
	}

	public static Car makeCar(String model, int year, String maker) {
		return new Car(model, year, maker);
	}

	public static List<Car> makeCar(List<Car> cars) {
		for (Car c : cars) {
			if (c.getMaker() == null)
				c.setMaker(Car.getCars(c.getModel()));
		}
		return cars;

	}
}
