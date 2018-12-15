package myPackage;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class CarMain {
	public static void main(String[] args) {
		Car.setCar();
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		for(int i=1;i<4;i++) {
			Car car = (Car)context.getBean("car" + i);
			car.printInfo();
			System.out.println("");
		}
	}
}
