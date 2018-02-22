/* http://59.23.150.58/30stair/pascal_tri/pascal_tri.php?pname=pascal_tri */

import java.util.Scanner;

public class PascalTree{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][] arr = new int[n][n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==0){
					arr[i][j]=1;
				}else if(i==0){
					arr[i][j]=0;
				}else{
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
				
				if(arr[i][j]==0){
					System.out.print(" ");
				}else{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}

		
	}
}


