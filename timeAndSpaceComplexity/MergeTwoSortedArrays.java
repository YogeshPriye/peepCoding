/**
 * https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/merge-two-sorted-arrays-official/ojquestion
 */
package timeAndSpaceComplexity;

import java.io.*;
import java.util.*;

public class MergeTwoSortedArrays {

	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    
	  int lenA = a.length;
	  int lenB = b.length;
	  int arr[] = new int[lenA + lenB];
	  int i = 0;
	  int j = 0;
	  for (int k = 0; k < arr.length; k++) {
		  if (i >= lenA && j < lenB) {
			  arr[k] = b[j];
			  j++;
		  } else if (j >= lenB && i < lenA) {
			  arr[k] = a[i];
			  i++;
		  } else {
			  if (a[i] < b[j]) {
				  arr[k] = a[i];
				  i++;
			  } else {
				  arr[k] = b[j];
				  j++;
			  }
		  }
	  }
    
	  return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
