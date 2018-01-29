/* http://119.201.123.184/30stair/fact/fact.php?pname=fact */
import java.util.Scanner;
public class Nfactoral{
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=1;
 
        for(int i=1;i<=n;i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
     
 
}