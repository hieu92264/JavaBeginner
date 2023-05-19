package De_03_1;

public class Bai1 {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int min = 0;
        for(int i=0; i<n; i++) {
            if(a[i]>0) {
                min = a[i];
                break;
            }
        }
        if(min == 0) System.out.println("Khong co so duong nao trong mang");
        else {
            for(int i=0; i<n; i++) {
                if(a[i]<min) min = a[i];
            }
            System.out.println(min);
        }
    }
}
