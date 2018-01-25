
/* http://119.201.123.184/30stair/3np1/3np1.php?pname=3np1 */
import java.util.Scanner;

public class 3np1{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.print(n+" ");
		while(n!=1){
			if(n%2==0){
				n=n/2;
				System.out.print(n+" ");
			}else{
				n=n*3+1;
				System.out.print(n+" ");
			}
		}
	}

}
