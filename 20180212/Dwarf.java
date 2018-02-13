/* http://59.23.150.58/30stair/dwarf/dwarf.php?pname=dwarf */

import java.util.Scanner;
public class Dwarf{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[9];
		int sum = 0;
		int liar1=0, liar2=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
			sum += arr[i];
		}
		
		//Find liars
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[i]+arr[j]==sum-100){
					liar1 = i;
					liar2 = j;
					break;
				}
			}
		}
		
		//Print list except for liars
		for(int i=0;i<arr.length;i++){
			if(i!=liar1 && i!=liar2){
				System.out.println(arr[i]);
			}
		}

	}
}
