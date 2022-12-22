/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/zero-one-knapsack-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class ZeroOneKnapsack {

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
    	
    	int dp[][] = new int[n + 1][limit + 1];
    	
    	for (int i = 0; i < dp.length; i++) {
    		for (int j = 0; j < dp[0].length; j++) {
    			if (i == 0) {
    				dp[i][j] = 0;
    			}
    			else if (j == 0) {
    				dp[i][j] = 0;
    			}
    			else {
    				if (wt[i - 1] > j) {
    					dp[i][j] = dp[i - 1][j];
    				}
    				else {
    					dp[i][j] = Math.max((cost[i - 1] + dp[i - 1][j - wt[i - 1]]), dp[i - 1][j]);
    				}
    			}
    		}
    	}
    	
    	System.out.println(dp[n][limit]);
    	
    	
    	
    }
}