/* http://59.23.150.58/30stair/variation/variation.php?pname=variation */

import java.util.Scanner;
public class Dispersion{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[in.nextInt()];
		double total = 0;
		double dispersion = 0;
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
			total = total + arr[i];
		}
		
		double average = total/arr.length;
		for(int i=0;i<arr.length;i++){
			dispersion += (arr[i]-average)*(arr[i]-average);
		}
		System.out.printf("%.2f",dispersion/arr.length);

	}
}
