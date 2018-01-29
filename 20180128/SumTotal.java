/* http://119.201.123.184/judgeonline/sts.php?pname=1ton */
import java.util.Scanner;
public class SumTotal {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
     
}