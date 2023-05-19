package De_01;
import java.io.*;
import java.util.Scanner;;

public class Bai2 {
    public static int Count(File file) {
        String key = "tt";
        int count = 0;
        File[] fis = file.listFiles();
        for(int i=0; i< fis.length; i++) {
            if(fis[i].isFile()) {
                if(fis[i].getName().startsWith(key)) count++;
            } else count +=Count(fis[i]);
        }
        return count;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        if(file.isFile()) {
            System.out.println("Duong dan khong phai thu muc");
        } else {
            System.out.println("So file la: " + Count(file));
        }
        sc.close();
    }
}
