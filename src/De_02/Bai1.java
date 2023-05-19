package De_02;

public class Bai1 {
    public static void main(String[] args) {
        if(args.length<0) System.out.println("Ban chua nhap doi so!");
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int s = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            int j;
            for(j=2; j<a[i]; j++) {
                if(a[i] % j == 0) break;
            }
            if(j == a[i]) {
             s+=a[i]; 
             count++;
            }
        }
        System.out.println(s/count);
    }
}
