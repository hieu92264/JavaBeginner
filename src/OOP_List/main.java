package OOP_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        for (Student student : list) {
            student.nhap(sc);
            list.add(student);
        }
        Collections.sort(list);
        sc.close();
    }
}
//cmt
