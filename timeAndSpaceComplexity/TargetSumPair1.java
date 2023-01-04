/**
 * https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/target-sum-pair-1-official/ojquestion
 */
package timeAndSpaceComplexity;

import java.io.*;
import java.util.*;

public class TargetSumPair1 {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
	  Arrays.sort(arr);
	  int i = 0;
	  int j = arr.length - 1;
	  while ( i < j) {
		  int val = arr[i] + arr[j];
		  if (val > target) {
			  j--;
		  } else if (val < target) {
			  i++;
		  } else {
			  System.out.println(arr[i] + ", " + arr[j]);
			  i++;
			  j--;
		  }
	  }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}