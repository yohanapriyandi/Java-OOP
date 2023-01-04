package ardhastudio.application;

/**
 * Implementasi equals method di java
 */
public class EqualsApp {
    public static void main(String[] args) {
        String first = "Yohan";
        first = first + " " + "Apriyandi";

        System.out.println(first);

        String second = "Yohan Apriyandi";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
