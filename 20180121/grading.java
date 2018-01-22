/* https://www.hackerrank.com/challenges/grading/problem */
import java.io.;
import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;

public class Solution {

    static int[] solve(int[] grades){
        int value, remain;
        for(int i = 0; igrades.length; i++){
            if(grades[i]=38){
                value = grades[i]5;
                remain = grades[i]%5;
                if(remain%52){
                    grades[i]=value5+5;
                }
            }
        }
        
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i  n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i  result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1  n  ));
        }
        System.out.println();
        

    }
}
