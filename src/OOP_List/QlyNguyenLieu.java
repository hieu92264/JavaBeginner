import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QlyNguyenLieu {
    
    public static class NLBot implements Comparable<NLBot>{
        int maso;
        String name;
        double kl;
        int sl;
        public NLBot() {}
        public void nhap(Scanner sc) {
            maso = sc.nextInt();
            name = sc.nextLine();
            kl = sc.nextDouble();
            sl = sc.nextInt();
        }
        public String toString() {
            return "Ma so: " + maso + ";Ten San Pham: " + name + ";Khoi Luong: " + kl + ";So Luong: " + sl + ";";
        }
        public int getMaso() {
            return maso;
        }
    
        public void setMaso(int maso) {
            this.maso = maso;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getKl() {
            return kl;
        }
    
        public void setKl(double kl) {
            this.kl = kl;
        }
    
        public int getSl() {
            return sl;
        }
    
        public void setSl(int sl) {
            this.sl = sl;
        }
        public int compareTo(NLBot other) {
            if (this.kl < other.getKl()) {
                return -1;
            } else if (this.kl > other.getKl()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public static class NLLong implements Comparable<NLLong> {
        int maso;
        String name;
        double thetich;
        double DoSoi;
        double DoTanChay;
        double NhietDungRieng;
        public NLLong() {}
        public void nhap(Scanner sc) {
            maso = sc.nextInt();
            name = sc.nextLine();
            thetich = sc.nextDouble();
            DoSoi = sc.nextDouble();
            DoTanChay = sc.nextDouble();
            NhietDungRieng = sc.nextDouble();
        }
        public String toString() {
            return "Ma so: " + maso + ";Ten San Pham: " + name + ";The tich: " + thetich + ";Do soi: " + DoSoi + ";Nhiet do tan chay: " + DoTanChay + ";Nhiet dung rieng: " + NhietDungRieng + ";";
        }
        public int getMaso() {
            return maso;
        }
    
        public void setMaso(int maso) {
            this.maso = maso;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getThetich() {
            return thetich;
        }
    
        public void setThetich(double thetich) {
            this.thetich = thetich;
        }
    
        public double getDoSoi() {
            return DoSoi;
        }
    
        public void setDoSoi(double DoSoi) {
            this.DoSoi = DoSoi;
        }
    
        public double getDoTanChay() {
            return DoTanChay;
        }
    
        public void setDoTanChay(double DoTanChay) {
            this.DoTanChay = DoTanChay;
        }
    
        public double getNhietDungRieng() {
            return NhietDungRieng;
        }
    
        public void setNhietDungRieng(double NhietDungRieng) {
            this.NhietDungRieng = NhietDungRieng;
        }
        public int compareTo(NLLong other) {
            if (this.thetich < other.getThetich()) {
                return -1;
            } else if (this.thetich > other.getThetich()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public static class DanhSach {
        ArrayList<NLBot> dangbot;
        ArrayList<NLLong> danglong;
        public DanhSach() {
            dangbot = new ArrayList<NLBot>();
            danglong = new ArrayList<NLLong>();
        }
        public void nhap(Scanner sc) {
            int check;
            System.out.println("Ban muon gi? [1].Nhap NL bot; [2].Nhap NL long; [0].Thoat");
            check = sc.nextInt();
            while(check != 0) {
                if(check == 1) {
                    NLBot temp = new NLBot();
                    temp.nhap(sc);
                    dangbot.add(temp);
                } else if(check == 2) {
                    NLLong temp = new NLLong();
                    temp.nhap(sc);
                    danglong.add(temp);
                }
                check = sc.nextInt();
            }
        }
        public void show() {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Danh sach nguyen lieu dang bot: ");
            for (NLBot nlBot : dangbot) {
                System.out.println(nlBot);
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Danh sach nguyen lieu dang long: ");
            for (NLLong nllong : danglong) {
                System.out.println(nllong);
            }
        }
        public void update(Scanner sc) {
            int key = sc.nextInt();
            for (NLBot nlBot : dangbot) {
                if(nlBot.getMaso() == key) {
                    System.out.println("Moi ban chinh sua du lieu NL bot: ");
                    nlBot.setName(sc.nextLine());
                    nlBot.setKl(sc.nextInt());
                    nlBot.setSl(sc.nextInt());
                }
            }
            for (NLLong nllong : danglong) {
                if(nllong.getMaso() == key) {
                    System.out.println("Moi ban chinh sua du lieu NL long: ");
                    nllong.setName(sc.nextLine());
                    nllong.setThetich(sc.nextInt());
                    nllong.setDoSoi(sc.nextInt());
                    nllong.setDoTanChay(sc.nextInt());
                    nllong.setNhietDungRieng(sc.nextInt());
                }
            }
        }
        public void delete(Scanner sc) {
            int key = sc.nextInt();
            for (NLBot nlBot : dangbot) {
                if(nlBot.getMaso() == key) {
                    dangbot.remove(nlBot);
                }
            }
            for (NLLong nllong : danglong) {
                if(nllong.getMaso() == key) {
                    danglong.remove(nllong);
                }
            }
        }
        public void search(Scanner sc) {
           
        }
        public void sort() {
            Collections.sort(dangbot);
            Collections.sort(danglong);
        }
        public void save() {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("Myfile.txt", true)); // Mở tệp tin với chế độ ghi tiếp
                String data = "Nguyen lieu dang bot: ";
                writer.newLine();
                for (NLBot nlBot : dangbot) {
                    data = String.valueOf(nlBot);
                    writer.write(data);
                    writer.newLine(); // Thêm dòng mới sau mỗi dữ liệu
                }
                data = "Nguyen lieu dang long: ";
                for (NLLong nllong : danglong) {
                    data = String.valueOf(nllong);
                    writer.write(data);
                    writer.newLine(); // Thêm dòng mới sau mỗi dữ liệu
                }
                writer.close();
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi khi lưu dữ liệu vào tệp tin: " + e.getMessage());
            }
        }
        public void open(String path) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String line;
                while((line = reader.readLine()) != null) {
                    if(line.equals("Nguyen lieu dang bot: ")) {
                        while((line=reader.readLine())!=null && (line = reader.readLine()) != "Nguyen lieu dang long: ") {
                            String[] parts = line.split(";"); // một mảng các chuỗi ngăn cách bởi dấu ;
                            int maso = Integer.parseInt(parts[0].split(":")[1].trim()); // chia các chuỗi trong mảng parts thành các mảng bé hơn sau dấu : sau đó dùng trim để loại bỏ các dấu cách thừa
                            String name = parts[1].split(":")[1].trim();
                            double kl = Double.parseDouble(parts[2].split(":")[1].trim());
                            int sl = Integer.parseInt(parts[3].split(":")[1].trim());
                            NLBot temp = new NLBot();
                            temp.setMaso(maso);
                            temp.setName(name);
                            temp.setKl(kl);
                            temp.setSl(sl);
                            dangbot.add(temp);
                        } 
                    } else if(line.equals("Nguyen lieu dang long: ")) {
                        while((line=reader.readLine())!=null) {
                            String[] parts = line.split(";");
                            int maso = Integer.parseInt(parts[0].split(":")[1].trim());
                            String name = parts[1].split(":")[1].trim();
                            double thetich = Double.parseDouble(parts[2].split(":")[1].trim());
                            double DoSoi = Double.parseDouble(parts[3].split(":")[1].trim());
                            double DoTanChay = Double.parseDouble(parts[4].split(":")[1].trim());
                            double NhietDungRieng = Double.parseDouble(parts[5].split(":")[1].trim());
                            NLLong temp1 = new NLLong();
                            temp1.setMaso(maso);
                            temp1.setName(name);
                            temp1.setThetich(thetich);
                            temp1.setDoSoi(DoSoi);
                            temp1.setDoTanChay(DoTanChay);
                            temp1.setNhietDungRieng(NhietDungRieng);
                            danglong.add(temp1);
                        }
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi khi mở dữ liệu vào tệp tin: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        int check = 0;
        Scanner sc = new Scanner(System.in);
        DanhSach list = new DanhSach();
        while(check != -1) {
            System.out.println("[1].Nhap lieu thong tin ve cac loai nguyen lieu;");
            System.out.println("[2].Xem danh sach cac loai kem infor;");
            System.out.println("[3].Chinh sua thong tin ve mot loai nguyen lieu dua theo ma so;");
            System.out.println("[4].Xoa mot loai nguyen lieu;");
            System.out.println("[5].Tim kiem nguyen lieu dua theo khoi luong hoac the tich con it hon mot gia tri dung de tim kiem;");
            System.out.println("[6].Sap xep;");
            System.out.println("[7].Luu danh sach;");
            System.out.println("[8].Nhap du lieu tu danh sach;");
            System.out.println("[0].Thoat;");
            check = sc.nextInt();
            switch(check) {
                case 0: {
                    check = -1;
                    break;
                }
                case 1: {
                    list.nhap(sc);
                    break;
                }
                case 2: {
                    list.show();
                    break;
                }
                case 3: {
                    System.out.println("Moi ban nhap ma so: ");
                    list.update(sc);
                    break;
                }
                case 4: {
                    System.out.println("Moi ban nhap ma so: ");
                    list.delete(sc);
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    list.sort();
                    break;
                }
                case 7: {
                    list.save();
                    break;
                }
                case 8: {
                    System.out.println("Moi ban nhap duong dan file: ");
                    String path = sc.nextLine();
                    list.open(path);
                    break;
                }
            }
        }
        sc.close();
    }
}
