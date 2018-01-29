/* http://119.201.123.184/30stair/modular_inverse/modular_inverse.php?pname=modular_inverse */
import java.util.Scanner;
public class ModularInverse{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		Boolean flag=false;
		
		for(int i=1;i<n;i++){
			if(x*i%n==1){
				System.out.println(i);
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println("No such integer exists.");
		}
		
	}
	

}
