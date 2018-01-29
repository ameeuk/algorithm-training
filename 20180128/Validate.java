/* http://119.201.123.184/30stair/validate/validate.php?pname=validate */
import java.util.Scanner;
public class Validate{
	static int square(int n){
		return n*n;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		int sum=0;
		
		for(int i=0;i<5;i++){
			n = in.nextInt();
			sum = sum + square(n);
		}
		System.out.println(sum%10);
	}
	

}
