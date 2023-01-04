package ardhastudio.application;

import ardhastudio.data.City;
import ardhastudio.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        //var lokasi  = new Location();//error karena abstract tidak bisa di instantiate
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
}
