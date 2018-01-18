import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long min=0;
        long max=0;
        for(int j=0; j<arr.length;j++){
             for(int i=0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        
        for(int i=0;i<arr.length-1;i++){
            min = min + arr[i];
        }
        for(int i=1;i<arr.length;i++){
            max = max + arr[i];
        }
        System.out.print(min+" "+max);
           
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
