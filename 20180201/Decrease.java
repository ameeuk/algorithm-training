/* http://59.23.150.58/afterbbs/showmessageafter.php?pname=54321 */

import java.util.Scanner;
public class Decrease{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int j=0;j<n;j++){
			for(int i=n-j;i>0;i--){
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
	

}
