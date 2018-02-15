/* http://59.23.150.58/30stair/jumsu/jumsu.php?pname=jumsu */

import java.util.Scanner;
public class Jumsu{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[in.nextInt()];
		int total = 0;
		int score=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
			if(arr[i]==1){
				score++;
			}else{
				score=0;
			}
			total += score;
		}
		System.out.println(total);

	}
}
