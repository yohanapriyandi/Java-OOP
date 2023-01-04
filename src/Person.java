class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    // variable shadowing perlu diperhatikan penamaan variable dan parameter sehingga tidak terjadi variable shadowing
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String paramName){// this method overloading
        this(paramName, null);
    }

    Person(){
        this(null);
    }

    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + " My name is " + this.name);
    }
}
