/* http://119.201.123.184/30stair/ft/ft.php?pname=ft */
import java.util.Scanner;
public class AliquotSet{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=0;
		int sum=0;
		int multiple=1;
		

		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
				count++;
				sum = sum + i;
				multiple = (multiple * i)%10;
				
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println(sum);
		System.out.println(multiple);

	}
	

}
