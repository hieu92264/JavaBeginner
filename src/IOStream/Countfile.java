package IOStream;

import java.io.File;

public class Countfile {
    public Countfile() {}
    public int count(String path) {
        int dem = 0;
        File file = new File(path);
        String[] list = file.list();
        for(int i=0; i<list.length; i++) {
            if(new File(file.getAbsolutePath() + File.separator + list[i].toString()).isFile()) {
                dem++;
            } else dem += count(file.getAbsolutePath() + File.separator + list[i].toString());
        }
        return dem;
    }
}
