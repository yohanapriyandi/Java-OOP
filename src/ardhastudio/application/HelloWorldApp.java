package ardhastudio.application;

import ardhastudio.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld lang1 = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld lang2 = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        lang1.sayHello();
        lang1.sayHello("Yohan");

        lang2.sayHello();
        lang2.sayHello("Fathar");


    }
}
