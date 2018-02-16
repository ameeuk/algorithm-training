/* http://59.23.150.58/30stair/ddm/ddm.php?pname=ddm */

import java.util.Scanner;
public class DDMatrix{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] arr = new int[5][5];
		int sum=0;
		int base=0;
		Boolean flag=true;
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				arr[i][j]=in.nextInt();
				//remove minus
				if(arr[i][j]<0){
					arr[i][j]*=-1;
				}
				
				if(i==j){
					base = arr[i][j];
				}else{
					sum = sum + arr[i][j];
				}
			}
			//check size
			if(base>=sum){
				flag = true;
			}else{
				flag = false;
			}
			sum = 0;
			
		}
		
		if(flag){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		

	}
}
