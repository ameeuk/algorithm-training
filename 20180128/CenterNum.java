/* http://119.201.123.184/30stair/center1/center1.php?pname=center1 */
import java.util.Scanner;
public class CenterNum{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum=0;
		int sum2=0;
		
		for(int i=1;i<n;i++){
			sum = sum + i;
		}
		
		while(sum2<sum){
			sum2 = sum2 + (n+1);
			n++;
		}
		String result = (sum==sum2)?"O":"X";
		System.out.println(result);
	}
	

}
