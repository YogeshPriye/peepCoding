/**
 * https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/sort-dates-official/ojquestion
 */
package timeAndSpaceComplexity;

import java.io.*;
import java.util.*;

public class SortDates {

  public static void sortDates(String[] arr) {
    // write your code here
	  countSort(arr, 1000000, 100, 32);
	  countSort(arr, 10000, 100, 13);
	  countSort(arr, 1, 10000, 2501);
	  
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    // write your code here
	  int freqC[] = new int[range];
	   String cArr[] = new String[arr.length];
	   for (int i = 0; i < arr.length; i++) {
		   int indx = Integer.parseInt(arr[i], 10) / div % mod;
		   freqC[indx] = freqC[indx] + 1; 
		   cArr[i] = arr[i];
	   }
	   freqC[0] = freqC[0] - 1;
	   for (int i = 1; i < freqC.length; i++) {
		   freqC[i] = freqC[i] + freqC[i - 1];
	   }
	   for (int i = arr.length - 1; i >= 0; i--) {
		   int indx = Integer.parseInt(cArr[i], 10) / div % mod;
		   arr[freqC[indx]] = cArr[i]; 
		   freqC[indx] = freqC[indx] - 1; 
	   }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}
