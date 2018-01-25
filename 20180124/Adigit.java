/* http://119.201.123.184/30stair/adigit/adigit.php?pname=adigit */
import java.util.Scanner;

public class Adigit{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[3];
		
		for(int i = 0; i<7; i++){
			int x = in.nextInt();
			
			if(x<10){
				arr[0]+=x;
			}else if(x>9 && x<100){
				arr[1]+=x;
			}else{
				arr[2]+=x;
			}
		}
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

	}

}
