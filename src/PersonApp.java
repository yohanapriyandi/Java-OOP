public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Yohan", "Kuningan");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Fathar");

        System.out.println("=======================================================");

        // use constructor Person2(paramName) when code is run field address -> null
        var person2 = new Person("Fathar Dhabit Adz-dzaky");
        person2.address = "Kuningan";
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
    }
}
