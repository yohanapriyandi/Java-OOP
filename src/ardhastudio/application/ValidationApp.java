package ardhastudio.application;

import ardhastudio.data.LoginRequest;
import ardhastudio.error.ValidationException;
import ardhastudio.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Fathar", "1234567");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data is Valid");
        }catch (ValidationException exception){
            System.out.println("Data tidak valid: " + exception.getMessage());
        }catch (NullPointerException exception){
            System.out.println("Data null: " + exception.getMessage());
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);

    }
}
