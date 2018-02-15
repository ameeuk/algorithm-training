/* http://59.23.150.58/30stair/box_brick/box_brick.php?pname=box_brick */
import java.util.Scanner;
public class BoxBrick{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[in.nextInt()];
		int total = 0;
		int rest = 0;
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
			total = total + arr[i];
		}
		
		int average = total/arr.length;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>average){
				rest += arr[i]-average;
			}	
		}
		System.out.println("The minimum number of moves is "+rest+".");

	}
}
