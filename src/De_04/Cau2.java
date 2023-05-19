package De_04;
import java.io.*;

public class Cau2 {
    public static int CountString(String path) {
        int Count = 0;
        File file = new File(path);
        if(file.isFile()) {
            try {
                FileReader reader = new FileReader(file);
                int c;
                char[] string = new char[99];
                int count = 0;
                while((c=reader.read())!= -1 || count < 100) {
                   string[count] = (char)c;
                   count++;
                }
                for(int i=0; i<string.length; i++) {
                    if(string[i] == 'A' && string[i+1] == 'T') {
                        Count++;
                    }
                }
                reader.close();
            } catch(Exception ex) {

            }

        }
        return Count;
    }
    public static void main(String[] args) {
        String path = args[0];
        System.out.println(CountString(path));
    }
}
