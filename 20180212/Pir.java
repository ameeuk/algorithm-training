/* http://59.23.150.58/30stair/pir/pir.php?pname=pir */
import java.util.Scanner;
public class Pir{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[20];
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(arr[0]+arr[1]);
		System.out.printf("%d %d",arr[0],arr[1]);

	}
}
