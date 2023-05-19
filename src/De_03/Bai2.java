package De_03;
import java.io.*;

public class Bai2 {

    public static int CountStringInFile(File file, String key) {
        int count = 0;
        try {
            FileInputStream input = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while((line = reader.readLine()) != "") {
                int index = line.indexOf(key);
                while(index != -1) {
                    count++;
                    index = line.indexOf(key, index);
                }
            }
            reader.close();
        } catch (Exception ex) {

        }
        return count;
    }
    public static int CountString(String path, String key) {
        int count = 0;
        File file = new File(path);
        File[] listfile = file.listFiles();
        for (File file2 : listfile) {
            if(file2.isFile()) {
                CountStringInFile(file2, key);
            } else {
                count += CountString(file.getAbsolutePath() + "\\" + file2.getName(), key);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String path = args[0];
        String key = args[1];
        CountString(path, key);
    }
}
