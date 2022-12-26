/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/maximum-sum-non-adjacent-elements-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class MaximumSumNonAdjacentElements {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int arr[] = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    	}
    	scan.close();
    	int inc = arr[0];
    	int exc = 0;
    	
    	for (int i = 1; i < n; i++) {
    		int temp = exc + arr[i];
    		exc = Math.max(inc, exc);
    		inc = temp;
    	}
    	
    	System.out.println(Math.max(inc, exc));
    }
}