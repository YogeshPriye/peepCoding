/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/target-sum-subsets-dp-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class TargetSumSubset {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int arr[] = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    	}
    	int tar = scan.nextInt();
    	scan.close();
    	
    	boolean dp[][] = new boolean[n + 1][tar +1];
    	dp[0][0] = true;
    	for (int i = 1; i < dp[0].length; i++) {
    		dp[0][i] = false; 
    	}
    	for (int i = 1; i < dp.length; i++) {
    		for (int j = 0; j < dp[0].length; j++) {
    			if (j == 0) {
    				dp[i][j] = dp[i - 1][j];
    			}
    			else if (arr[i - 1] > j) {
    				dp[i][j] = dp[i - 1][j];
    			}
    			else {
    				dp[i][j] = dp[i -1][j] || dp[i - 1][j - arr[i - 1]];
    			}
    		}
    	}
    	System.out.println(dp[n][tar]);
    }
}