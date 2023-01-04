public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePresident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Yohan"));
        sayHello(new Manager("Fathar"));
        sayHello(new VicePresident("Nabil"));

    }

    static void sayHello(Employee employee){
        // check and cast
        // untuk melakukan konversi data sebaiknya dilakukan pengecekan terlebih dahulu
        // supaya meminimalisir error ketika program dicompile
        if (employee instanceof VicePresident){
            VicePresident vp  = (VicePresident) employee;
            System.out.println("Hello VP " + vp.name);
        } else if(employee instanceof Manager){
            Manager manager  = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else{
            System.out.println("Hello " + employee.name);
        }

    }
}
