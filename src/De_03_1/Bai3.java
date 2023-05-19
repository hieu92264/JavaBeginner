package De_03_1;
import java.util.*;

public class Bai3 {
    public static class HangHoa {
        int ID;
        String Name;
        String DonViTinh;
        double dongia;
        public HangHoa(){}
        public String toString() {
            return "ID: " + ID + " Ten hang hoa " + Name + " Don vi tinh: " + DonViTinh + " Don gia: " + dongia;
        }
        public void nhap(Scanner sc) {
            ID = sc.nextInt();
            Name = sc.nextLine();
            sc.nextLine();
            DonViTinh = sc.nextLine();
            dongia = sc.nextDouble();
        }
    }
    public static class management extends HangHoa {
        int n;
        HangHoa[] list;
        public management() {
            super();
            list = new HangHoa[n];
        }
        public void nhap(Scanner sc) {
            for(int i=0; i<n; i++) {
                list[i].nhap(sc);
            }
        }
        public void sapxep() {
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(list[j].dongia < list[i].dongia) {
                        HangHoa hh = list[i];
                        list[i] = list[j];
                        list[j] = hh;
                    }
                }
            }
            for(int i=0; i<n; i++) {
                System.out.println(list[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        management manage = new management();
        manage.nhap(sc);
        manage.sapxep();
        sc.close();
    }
}
