package ardhastudio.application;

import ardhastudio.data.Avanza;
import ardhastudio.data.Bis;
import ardhastudio.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        System.out.println(car.isBig());
        System.out.println("==============================================");
        Car bigcar = new Bis();
        bigcar.drive();
        System.out.println(bigcar.getTire());
        System.out.println(bigcar.getBrand());
        System.out.println(bigcar.isBig());

    }
}
