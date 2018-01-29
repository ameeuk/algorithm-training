/* http://119.201.123.184/30stair/nfactor/nfactor.php?pname=nfactor */
import java.util.Scanner;
public class AliquotN{
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        int count=0;
 
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
 
    }
     
 
}