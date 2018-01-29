/* http://119.201.123.184/30stair/gcd_lcm/gcd_lcm.php?pname=gcd_lcm */
import java.util.Scanner;

public class GcdLcm {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		
		int gcd=0; //최대공약수
		int lcm=0; //최소공배수
		
		for(int i=1; i<=a*b; i++){
			if(a%i==0 && b%i==0){
				gcd=i;
			}
		}
		lcm = a*b/gcd;
		System.out.println(gcd+" "+lcm);
	}
}
