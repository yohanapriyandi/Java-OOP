package ardhastudio.application;

import ardhastudio.data.Constant;
import ardhastudio.data.Country;
import ardhastudio.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATIOIN);
        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Country.City city = new Country.City();
        city.setName("Kuningan");

        System.out.println(city.getName());
    }
}
