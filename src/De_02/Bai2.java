package De_02;
import java.io.*;

public class Bai2 {
    public static void PrintfChar(String path) {

        File file = new File(path);
        if(file.isFile()) {
            try {
                FileReader reader = new FileReader(file);
                int c;
                int count =0;
                while((c = reader.read()) != -1 && count <= 100) {
                    System.out.println((char)c);
                }
                reader.close();

            } catch(Exception e) {
            }
        } else System.out.println("Khong phai la duong dan cua file!");


    }
    public static void main(String args[]) {
        String path = args[0];
        PrintfChar(path);
    }
}
