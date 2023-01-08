package ardhastudio.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Membuat objek LoginRequest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
