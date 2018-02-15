/* http://59.23.150.58/30stair/post.php?pname=distinct */
import java.util.Scanner;
public class Distinct{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cnt = 0;
		int n=in.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j+1]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				cnt++;
			}
		}
		System.out.println(cnt+1);

	}
}
