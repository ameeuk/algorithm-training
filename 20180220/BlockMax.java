/* http://59.23.150.58/30stair/block_max/block_max.php?pname=block_max */

import java.util.Scanner;
public class BlockMax{
	 static int partMax(int x, int y,int arr[][]){
		int max=0;
		for(int i=x;i<x+3;i++){
			for(int j=y;j<y+3;j++){
				if(arr[i][j]>max){
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] arr = new int[9][9];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i%3==0 && j%3==0){
					System.out.println(partMax(i,j,arr));
				}
			}
		}
		
	}
}
