package De_03;

public class Bai1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int max = 0;
        for(int i=0; i<n; i++) {
            int s = 1;
            for(int j = 1; j<a[i]; j++) {
                if(a[i]%j==0) {
                    s+=j;
                }
            }
            if(s==a[i] && a[i] > max) max = a[i];
        }
        System.out.println(max);
    }
}
