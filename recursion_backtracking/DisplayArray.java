/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-official/ojquestion
 */

package recursion_backtracking;

import java.io.*;
import java.util.*;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
        
    	Scanner scan = new Scanner(System.in);
    	int idx = scan.nextInt();
    	int arr[] = new int[idx];
    	for (int i = 0; i < idx; i++) {
    		arr[i] = scan.nextInt();
    	}
    	displayArr(arr, idx);
    }

    public static void displayArr(int[] arr, int idx){
        
    	if (idx == 0) {
    		return;
    	}
    	displayArr(arr, idx - 1);
    	System.out.println(arr[idx - 1]);
    }

}
