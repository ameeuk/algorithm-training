
/* http://119.201.123.184/30stair/max/max.php?pname=max */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max=0;
		
		for(int i = 0; i<7; i++){
			int x = in.nextInt();
			if(x>max){
				max=x;
			}
		}
		System.out.println(max);

	}

}
