/* http://59.23.150.58/30stair/offset/offset.php?pname=offset */

import java.util.Scanner;
public class Offset{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] arr = new int[7][7];
		
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				arr[i][j]=9;
			}
		}
		
		for(int i=1;i<6;i++){
			for(int j=1;j<6;j++){
				arr[i][j]=in.nextInt();
			}
		}
		
		for(int i=1;i<6;i++){
			for(int j=1;j<6;j++){
				if(arr[i-1][j]>arr[i][j] && arr[i][j+1]>arr[i][j] && arr[i+1][j]>arr[i][j] && arr[i][j-1]>arr[i][j]){
					System.out.print("* ");
				}else{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		

	}
}
