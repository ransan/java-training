package must_do_coding_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;


public class SubArraySum {

    public static void main(String[] args) {
       System.out.println("*****Find a subarray Sum******");
       int[] array = { 1,2,3,7,5 };
       int target = 12;
       for(int i=0;i<array.length;i++){
           int sum=array[i];
           for(int j=i+1; j<=array.length;j++){
               if(sum == target) {
                   System.out.println( i+1 + " " + (j));
                   return;
               }
               if(sum > target || j==array.length)
                   break;
               sum= sum + array[j];
           }
       }
       
    }
} 