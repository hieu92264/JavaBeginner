package De_03_1;
import java.io.*;

public class Bai2 {

    public static int countInFile(File file, String key) {
        int count = 0;
        String[] listName = file.list();
        for(int i = 0; i<listName.length; i++) {
            if(listName[i].startsWith(key)) {
                count++;
            }
        }
        return count;
    }
    public static int Count(String path) {
        String key = "#intel";
        int count = 0;
        File file = new File(path);
        File[] list = file.listFiles();
        for (File file2 : list) {
            if(file2.isFile()) {
                count +=countInFile(file2, key);
            } else {
                count += Count(path + "\\" + file2.getName());
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String path = args[0];
        Count(path);
    }
}
