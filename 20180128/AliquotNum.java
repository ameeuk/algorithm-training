/* http://119.201.123.184/30stair/yaksu/yaksu.php?pname=yaksu */
import java.util.Scanner;
public class AliquotNum{
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum=0;
        int count=0;
 
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                if(count==k){
                    System.out.println(i);
                    break;
                }
            }
        }
        if(count<k)
            System.out.println("0");
 
    }
     
 
}