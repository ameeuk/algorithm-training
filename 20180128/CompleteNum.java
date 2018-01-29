/* http://119.201.123.184/30stair/complete/complete.php?pname=complete */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum=0;
		
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum = sum + i;
			}
		}
		if(sum==n){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	

}
