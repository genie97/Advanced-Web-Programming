package myPackage;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class CarMain {
	public static void main(String[] args) {
		Car.setCars();
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		for (int i = 1; i <= 4; i++) {
			Employee worker = (Employee) context.getBean("employee" + i);
			System.out.println("Employee" + i);
			worker.printInfo();
			System.out.println("-------------------------------");
		}
	}
}
