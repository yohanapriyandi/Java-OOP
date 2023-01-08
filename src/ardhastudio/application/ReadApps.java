package ardhastudio.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApps {
    public static void main(String[] args) {
        /**
         * implementasi try with resource
         * fitur ini hadir di java 7
         * untuk menggunakan fitur ini pastikan versi java anda mendukung fithru try with resource
         */
        try(BufferedReader reader = new BufferedReader(new FileReader("Readme.md"))) {

            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }

                System.out.println(line);
            }

        }catch (Throwable throwable){
            System.out.println("Error membaca file " + throwable.getMessage());
        }
        /**
         * apabila menggunakan try with resource
         * maka kita tidak memerlukan lagi block finally
         */
//        finally {
//            if (reader != null){
//                try {
//                    reader.close();
//                    System.out.println("closing yayy");
//                }catch (IOException exception){
//                    System.out.println("Error menutup resource: " + exception.getMessage());
//                }
//            }
//        }
    }
}
