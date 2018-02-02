/* http://59.23.150.58/30stair/b54321/b54321.php?pname=b54321 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k=0;
		for(int j=0;j<n;j++){
			for(int i=0;i<j;i++){
				System.out.print(" ");
			}
			for(int i=n-j;i>0;i--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
