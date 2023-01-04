package ardhastudio.data;

public class Avanza implements Car{
    @Override
    public void drive() {
        System.out.println("Avanza drive");
    }

    @Override
    public int getTire() {
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
