/* http://119.201.123.184/30stair/triangular_sum/triangular_sum.php?pname=triangular_sum */

import java.util.Scanner;
public class TriangluelarSum {
	static int sumT(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum=0;

		for(int i=1;i<=n;i++){
			sum = sum + i*sumT(i+1);
		}
		System.out.println(sum);
	}
	

}
