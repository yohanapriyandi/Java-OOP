package ardhastudio.data;

// in java we can extends more than one of interface use keyword "extends"
public interface Car extends HasBrand, IsMaintenance{
    void drive();

    int getTire();

    /**
     * this is example default method in java
     * default method present @ java 8 to last
     * for using default method use keyword "default" before your function
     * @return false
     */
    default boolean isBig(){
        return false;
    }
}
