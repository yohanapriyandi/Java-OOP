package ardhastudio.application;

import ardhastudio.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("root", null);
        System.out.println("OKneksi sukses");
    }

    private static void connectDatabase(String username, String password) {
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa konek ke database");
        }
    }
}
