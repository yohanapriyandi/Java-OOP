package ardhastudio.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
           sampleError();

        }catch (RuntimeException exception){
            exception.printStackTrace();
        }

    }

    public  static void sampleError(){
        try {
            String[] names = {
              "fathar", "Dhabit", "Adz-Dzaky"
            };
            System.out.println(names[5]);
        }catch (Throwable throwable){

            throw new RuntimeException(throwable);

        }
    }
}
