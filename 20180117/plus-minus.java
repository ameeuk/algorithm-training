import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
       int count1=0, count2=0, count3=0;
        for(int i = 0; i<arr.length;i++){
           
           if(arr[i]>0){
              count1++;
           }else if(arr[i]<0){
              count2++;
           }else{
              count3++; 
           }
       }
        
       System.out.println((double)count1/arr.length);
       System.out.println((double)count2/arr.length);
       System.out.println((double)count3/arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
