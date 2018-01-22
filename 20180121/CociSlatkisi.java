/*http://119.201.123.184/30stair/coci_slatkisi/coci_slatkisi.php?pname=coci_slatkisi*/
import java.util.Scanner;
public class CociSlatkisi {
	
	static int squareOf(int n){
		int result = 1;
		for(int i=0;i<n;i++){
			result = result*10;
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int ten = squareOf(b);
		int min = a/ten*ten;
		int max = min+ten;
		
		System.out.println(min+" "+max);
		if(max-a <= a-min){
			System.out.println(max);
		}else{
			System.out.println(min);
		}
	}
}
