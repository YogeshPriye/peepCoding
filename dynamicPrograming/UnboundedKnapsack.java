/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/unbounded-knapsack-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class UnboundedKnapsack {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int cost[] = new int[n];
    	int wt[] = new int[n];
    	
    	for (int i = 0; i < n; i++) {
    		cost[i] = scan.nextInt();
    	}
    	for (int i = 0; i < n; i++) {
    		wt[i] = scan.nextInt();
    	}
    	
    	int limit = scan.nextInt();
    	scan.close();
    	
    	int dp[] = new int[limit + 1];
    	dp[0] = 0;
    	
    	for (int j = 1; j < dp.length; j++) {
    		for (int i = 0; i < n; i++) {
    			if (wt[i] <= j) {
    				dp[j] = Math.max(dp[j], cost[i] + dp[j - wt[i]]);
    			}
    		}
    	}
    	System.out.println(dp[limit]);
    }
}
