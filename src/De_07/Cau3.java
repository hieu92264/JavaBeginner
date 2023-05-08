package De_07;

import java.util.ArrayList;

public class Cau3 {
    public static class sanpham {
        int msp;
        double gia;
        String name;
        String mota;
        public sanpham() {}
        public int getmsp() {return msp;}
        public String getName() {return name;}
    }
    public static class phancung extends sanpham {
        double kichthuoc;
        double khoiluong;
        public phancung() {super();}
    }
    public static class phanmem extends sanpham {
        String hotroHDH;
        String YeuCauPhanCung;
        String ThongSoKhuyenCao;
        String LoaiHinh;
        public phanmem() {super();}
        public String toString() {
            return msp + " " + name + " " + gia;
        }
    }
    public static class manage_phanmem extends phanmem {
        ArrayList<phanmem> list;
        public manage_phanmem() {
            super();
            list = new ArrayList<phanmem>();
        }
        public void add_Products() {
            phanmem product = new phanmem();
            list.add(product);
        }
        public void del_product(int msp) {
            for (phanmem product : list) {
                if(product.getmsp() == msp) {
                    list.remove(product);
                }
            }
        }
        public void print() {
            for (phanmem product : list) {
                System.out.println(product);
            }
        }
        public void find(String name) {
            for (phanmem product : list) {
                if(product.getName() == name) {
                    System.out.println(product);
                }
            }
        }
    }
    public static void main(String[] args) {
        manage_phanmem management = new manage_phanmem();
        management.add_Products();
        
    }
}
