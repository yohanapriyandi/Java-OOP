package ardhastudio.data;

public class Bis implements Car {

    @Override
    public void drive() {
        System.out.println("Bis drive");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "HINO";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
