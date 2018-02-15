/* http://59.23.150.58/30stair/dup/dup.php?pname=dup */
import java.util.Scanner;
public class RemoveDuplication{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cnt = 0;
		int n=10;
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
			}

			//자기 자신은 무조건 한 번 중복되므로
			if(cnt==1){
				System.out.print(arr[i]+" ");
			}
			cnt=0;
		}

	}
}
