package myPackage;

public class CarFactory {
	public static Car makeCar(String model, int year, String maker) {
		return new Car(model, year, maker);
	}

	public static Car makeCar(String model, int year) {
		return new Car(model, year, Car.getCar(model));
	}
}
