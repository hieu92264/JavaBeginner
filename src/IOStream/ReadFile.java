package IOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.InputStreamReader;
//import java.nio.Buffer;

public class ReadFile {
    public ReadFile() {}
    public void readfile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line;
            while((line = reader.readLine())!=null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
