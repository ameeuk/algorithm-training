package test;


import java.util.Scanner;
public class SumRule{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int column = in.nextInt();
		long [][] arr = new long[row][column];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr[i][j] = 1;
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(i==0){
					arr[i][j]=1;
				}else if(j==0){
					arr[i][j]=1;
				}else{
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
