/* http://119.201.123.184/30stair/spot/spot.php?pname=spot */
package test;

import java.util.Scanner;

public class Spot {

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double d = input.nextDouble();
	double p = input.nextDouble();

	//각도가 같으므로 r증가 비울과 d증가 비율이 같음을 이용.
	System.out.println(-d*(p/100));
	}
}

