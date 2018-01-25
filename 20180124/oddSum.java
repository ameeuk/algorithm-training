
/* http://119.201.123.184/30stair/odd/odd.php?pname=odd */
import java.util.Scanner;

public class oddSum{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[7];
		int oddSum=0;
		int min=101;
		
		for(int i = 0; i<7; i++){
			arr[i]= in.nextInt();
			if(arr[i]%2==1){
				oddSum += arr[i];
				if(arr[i]<min){
					min=arr[i];
				}
			}
		}
		if(oddSum==0){
			System.out.printf("-1");
		}else{
			System.out.printf("%d\n%d",oddSum,min);
		}
		

	}

}
