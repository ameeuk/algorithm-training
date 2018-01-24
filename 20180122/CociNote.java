/* http://119.201.123.184/30stair/coci_note/coci_note.php?pname=coci_note */

import java.util.Scanner;

public class CociNote {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int [] arr = new int[8];
		for(int i = 0;i<8;i++){
			arr[i]=in.nextInt();
		}
		String result="";
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1==arr[i+1]){
				result="ascending";
			}else if(arr[i]==arr[i+1]+1){
				result="descending";
			}else{
				result="mixed";
				break;
			}
		}

		System.out.println(result);
	}
}
