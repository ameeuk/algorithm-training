/* http://119.201.123.184/30stair/spot/spot.php?pname=spot */
package test;

import java.util.Scanner;

public class Spot {

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double d = input.nextDouble();
	double p = input.nextDouble();

	//������ �����Ƿ� r���� ���� d���� ������ ������ �̿�.
	System.out.println(-d*(p/100));
	}
}

