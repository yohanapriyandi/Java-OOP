package ardhastudio.data;

public enum Level {
    STANDARD("Standar member"),
    PREMIUM("Premium Member"),
    VIP("VIP Member");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return  description;
    }
}
