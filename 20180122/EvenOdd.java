/* http://119.201.123.184/30stair/even_odd/even_odd.php?pname=even_odd&stair=2 */
import java.util.Scanner;

public class EvenOdd{

	static String even_odd(int n){
		String result="";
		if(n%2==0 && n!=1){
			result="even";
		}else{
			result="odd";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.printf("%s+%s=%s",even_odd(a),even_odd(b),even_odd(a+b));
		System.out.println();
		System.out.printf("%s*%s=%s",even_odd(a),even_odd(b),even_odd(a*b));
			

	}

}
