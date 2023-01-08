package ardhastudio.application;

import static ardhastudio.data.Application.PROCESSORS;
import static  ardhastudio.data.Constant.*;
import ardhastudio.data.Country;
import ardhastudio.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(PROCESSORS);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Country.City city = new Country.City();
        city.setName("Kuningan");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
