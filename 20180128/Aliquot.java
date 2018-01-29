/* http://119.201.123.184/30stair/factor/factor.php?pname=factor */
import java.util.Scanner;
public class Aliquot{
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=1;
 
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
     
 
}