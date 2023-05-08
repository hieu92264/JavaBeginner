package De_07;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        for(int i=a; i<=b; i++) {
            if(i%4==0 && i%100 !=0) {
                s+=i;
            }
        }
        System.out.println(s);
        sc.close();
    }
}
