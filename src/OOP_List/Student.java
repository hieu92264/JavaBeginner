package OOP_List;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    public Student() {}
    String Name;
    String Lop;
    String Truong;
    int diemtb;
    public int getDiemtb() {
        return diemtb;
    }
    public void nhap(Scanner sc) {
        Name = sc.nextLine();
        Lop = sc.nextLine();
        Truong = sc.nextLine();
        sc.nextLine();
        diemtb = sc.nextInt();
    } 
    public int compareTo(Student other) {
        return (int)(other.diemtb - this.diemtb);
    }
}
