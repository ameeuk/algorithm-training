/* http://59.23.150.58/30stair/pmin/pmin.php?pname=pmin */
import java.util.Scanner;
public class Pmin{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = 100;
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			if(arr[i]<min)
				min = arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==min){
				System.out.print(i+1+" ");
			}
		}
	}
}
