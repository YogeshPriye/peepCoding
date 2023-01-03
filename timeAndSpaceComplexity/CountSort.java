/**
 * https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/count-sort-official/ojquestion
 */
package timeAndSpaceComplexity;

import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int freqC[] = new int[max - min + 1];
   int cArr[] = new int[arr.length];
   for (int i = 0; i < arr.length; i++) {
	   int indx = arr[i] - min;
	   freqC[indx] = freqC[indx] + 1; 
	   cArr[i] = arr[i];
   }
   freqC[0] = freqC[0] - 1;
   for (int i = 1; i < freqC.length; i++) {
	   freqC[i] = freqC[i] + freqC[i - 1];
   }
   for (int i = arr.length - 1; i >= 0; i--) {
	   int indx = cArr[i] - min;
	   arr[freqC[indx]] = cArr[i]; 
	   freqC[indx] = freqC[indx] - 1; 
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}