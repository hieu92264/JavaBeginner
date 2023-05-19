package De_01;

import java.util.Scanner;

public class Bai3 {
    public static class NhanVien {
        int ID;
        String name;
        //double hsl;
        int namsinh;
        public NhanVien() {}
        public void nhap(Scanner sc) {
            ID = sc.nextInt();
            name = sc.nextLine();
            //hsl = sc.nextDouble();
            namsinh = sc.nextInt();
        }
        public String toString() {
            return "ID: " + ID + " Name: " + name + " HSL: " + namsinh;
        }
       /*  public double getHSL() {
            return hsl;
        } */
    }
    public static class Management extends NhanVien {
        NhanVien[] list;
        int n;
        public Management() {
            super();
            list = new NhanVien[n];
        }
        public void nhap(Scanner sc) {
            n = sc.nextInt();
            for(int i=0; i<n; i++) {
                NhanVien nv = new NhanVien();
                nv.nhap(sc);
                
            }
        }
        public void sapxep() {
            for(int i=0; i<list.length; i++) {
                for(int j=i+1; j<list.length; i++) {
                    if(list[i].namsinh > list[j].namsinh) {
                        NhanVien nv = list[i];
                        list[i] = list[j];
                        list[j] = nv;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Management manage = new Management();
        manage.nhap(sc);
        manage.sapxep();
        sc.close();
    }
}
