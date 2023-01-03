/**
 * https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/radix-sort-official/ojquestion
 */
package timeAndSpaceComplexity;

import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here
	  int max = Integer.MIN_VALUE;
	  for (int i = 0; i < arr.length; i++) {
		  if (arr[i] > max) {
			  max = arr[i];
		  }
	  }
	  
	  int exp = 1;
	  while (exp <= max) {
		  countSort(arr, exp);
		  exp = exp * 10;
	  }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
	  int freqC[] = new int[10];
	   int cArr[] = new int[arr.length];
	   for (int i = 0; i < arr.length; i++) {
		   int indx = arr[i] / exp % 10;
		   freqC[indx] = freqC[indx] + 1; 
		   cArr[i] = arr[i];
	   }
	   freqC[0] = freqC[0] - 1;
	   for (int i = 1; i < freqC.length; i++) {
		   freqC[i] = freqC[i] + freqC[i - 1];
	   }
	   for (int i = arr.length - 1; i >= 0; i--) {
		   int indx = cArr[i] / exp % 10;
		   arr[freqC[indx]] = cArr[i]; 
		   freqC[indx] = freqC[indx] - 1; 
	   }
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}
