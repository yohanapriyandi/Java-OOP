package ardhastudio.application;

import ardhastudio.data.Animal;
import ardhastudio.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Bob";
        animal.run();

    }
}
