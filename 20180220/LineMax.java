/* http://59.23.150.58/30stair/aja/aja.php?pname=aja */

import java.util.Scanner;

public class Main {
	//Sum of horizontal
	static int hSum(int i, int j, int arr[][]){
		int sum=0;
		for(int x=j;x<j+5;x++){
			sum+=arr[i][x];
		}
		return sum;
	}
	//Sum of vertical
	static int vSum(int i, int j, int arr[][]){
		int sum=0;
		for(int x=i;x<i+5;x++){
			sum+=arr[x][j];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] arr = new int[10][10];
		int max=0;
		int sum=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				arr[i][j]=in.nextInt();
			}
		}
		
		//Find horizontal max
		for(int i=0;i<10;i++){
			for(int j=0;j<6;j++){
				sum=hSum(i,j,arr);
				if(sum>max){
					max=sum;
				}
			}
		}
		
		//Find vertical max
		for(int i=0;i<6;i++){
			for(int j=0;j<10;j++){
				sum=vSum(i,j,arr);
				if(sum>max){
					max=sum;
				}
			}
		}
		
		System.out.println(max);
		
	}
}


