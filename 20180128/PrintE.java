/* http://119.201.123.184/30stair/printe/printe.php?pname=printe */

import java.util.Scanner;
public class PrintE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			if(i==0 || i==n/2 || i==n-1){
				for(int j=0;j<n;j++){
					System.out.print("*");
				}
			}else{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
