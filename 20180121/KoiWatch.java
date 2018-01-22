/* http://119.201.123.184/30stair/koi_watch/koi_watch.php?pname=koi_watch */
package test;

import java.util.Scanner;

public class KoiWatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int [] time = new int[4];
		for(int i = 0;i<time.length;i++){
			time[i]=input.nextInt();
		}
		
		int timeToSec = time[0]*3600+time[1]*60+time[2];
		int totalSec = timeToSec+time[3];
		
		int hour = totalSec/3600;
		int minute = totalSec%3600/60;
		int sec = totalSec%3600%60;
		
		if(hour>23)
			hour=hour%24;
		System.out.println(hour+" "+minute+" "+sec);

	}
}
