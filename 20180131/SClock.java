/* http://59.23.150.58/30stair/sclock/sclock.php?pname=sclock */

import java.util.Scanner;
public class Main {
	public static void SClock(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n/2+1;i++){
			for(int j=0;j<i;j++){
				System.out.printf(" ");
			}
			for(int j=0;j<n-1-i*2;j++){
				System.out.print("*");
			}
			System.out.println("$");
		}
		for(int i=0;i<n/2;i++){
			for(int j=0;j<n/2-i-1;j++){
				System.out.print(" ");
			}
			System.out.print("$");
			for(int j=0;j<2+i*2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}
