package De_01;

public class Bai1 {
    public static void main(String[] args) {
        if(args.length == 0) System.out.println("Ban chua nhap doi so!");
        else {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int count = 0;
        for(int i=0; i<n; i++) {
            int s = 0;
            for(int j=1; j<a[i]; j++) {
                if(a[i]%j==0) s+=j;
            }
            if(s == a[i]) count++;
        }
        System.out.println("So hoan hao co trong mang la: " + count);
        }
    }
}
