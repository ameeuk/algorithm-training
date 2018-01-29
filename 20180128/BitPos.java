/* http://119.201.123.184/30stair/bit_pos/bit_pos.php?pname=bit_pos */
import java.util.Scanner;

public class BitPos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int i=0;
		while(a>0){
			if(a%2==1){
				System.out.print(i+" ");
			}
			a = a/2;
			i++;
		}
		
	}

}
