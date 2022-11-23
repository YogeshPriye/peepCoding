/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/max-of-an-array-official/ojquestion
 */

package recursion_backtracking;

import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	int idx = scan.nextInt();
    	int arr[] = new int[idx];
    	for (int i = 0; i < idx; i++) {
    		arr[i] = scan.nextInt();
    	}
    	System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
    	if (idx == arr.length - 1) {
    		return arr[idx];
    	}
    	int max = maxOfArray(arr, idx + 1);
    	if ( max > arr[idx]) {
    		return max;
    	}
    	else {
    		return arr[idx];
    	}
    }

}