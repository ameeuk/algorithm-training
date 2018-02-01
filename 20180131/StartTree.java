/* http://119.201.123.184/30stair/tri4/tri4.php?pname=tri4 */ 

import java.util.Scanner;
public class StarTree{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n/2+1;i++){
			for(int j=0;j<n/2-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
