package De_07;
import java.util.*;
public class test {
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
		int count = 0;
		double S = 0;
		for(int i=0; i<n ;i++) {
			if(checkSoNguyenTo(a[i])) {
				S+=a[i];
				count++;
			}
		}
		System.out.println(S/count);
		sc.close();
	}
	public static boolean checkSoNguyenTo(int n) {
		int i;
		for(i=2; i<n; i++) {
			if(n%i==0) break;
		}
		if(i==n) return true;
		return false;
	}
}
