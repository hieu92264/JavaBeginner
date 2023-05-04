package IOStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CountWord {
    public CountWord() {}
    public int countword(String path, String key) {
        int dem = 0;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = reader.readLine()) != null) {
                int index = line.indexOf(key);
                while (index != -1) {
                    dem++;
                    line.indexOf(key, index+1);
                }
            }
            reader.close();
        } catch(Exception ex) {
            ex.getMessage();
        }
        return dem;
    }
}
