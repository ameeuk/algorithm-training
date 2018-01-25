package test;
/* http://119.201.123.184/30stair/sb/sb.php?pname=sb */
import java.util.Scanner;

public class NMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=0;
		int max=0;
		
		for(int i=0; i<7; i++){
			int x = in.nextInt();
			if(x>max){
				max=x;
				n=i;
			}
		}
		System.out.println(n+1);

	}

}
