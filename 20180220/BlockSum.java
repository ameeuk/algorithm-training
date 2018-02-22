/* http://59.23.150.58/30stair/block/block.php?pname=block */

import java.util.Scanner;
public class BlockSum{
	 static int partSum(int x, int y,int arr[][]){
		int sum=0;
		for(int i=x;i<x+3;i++){
			for(int j=y;j<y+3;j++){
				sum += arr[i][j];
			}
		}
		return sum;
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
					System.out.println(partSum(i,j,arr));
				}
			}
		}
		
	}
}
