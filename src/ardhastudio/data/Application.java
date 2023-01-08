package ardhastudio.data;

public class Application {
    public static final  int PROCESSORS;

    static {
        System.out.println("Mengakses class app");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
