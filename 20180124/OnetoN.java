/* http://119.201.123.184/30stair/1ton1/1ton1.php?pname=1ton1 */
import java.util.Scanner;

public class OnetoN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		int x = in.nextInt();
		
		for(int i = 1; i<=x; i++){
			sum+=i;
			if(i==x){
				System.out.print(i);
				System.out.print("=");
			}else{
				System.out.print(i);
				System.out.print("+");
			}
		}
		System.out.println(sum);

	}

}