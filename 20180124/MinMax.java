
/* http://119.201.123.184/30stair/mM/mM.php?pname=mM */
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min=100;
		int max=0;
		
		for(int i = 0; i<7; i++){
			int x = in.nextInt();
			if(x<min){
				min=x;
			}
			if(x>max){
				max=x;
			}
		}
		System.out.println(max+" "+min);

	}

}
