/* http://59.23.150.58/30stair/above_average/above_average.php?pname=above_average */

import java.util.Scanner;
public class AboveAverage{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[in.nextInt()];
		int total = 0;
		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
			total = total + arr[i];
		}
		
		double average = (double)total/arr.length;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>average){
				cnt++;
			}	
		}
		System.out.printf("%.3f%%",(double)cnt/arr.length*100);

	}
}
