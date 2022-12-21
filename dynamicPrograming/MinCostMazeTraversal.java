/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/min-cost-maze-traversal-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class MinCostMazeTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int arr[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0;  j < m; j++) {
        		arr[i][j] = scan.nextInt();
        	}
        }
        
        int dp[][] = new int[n][m];
        
        for (int i = n - 1; i >= 0; i--) {
        	for (int j = m - 1; j >= 0; j--) {
        		if (i == n - 1 && j == m - 1) {
        			dp[i][j] = arr[i][j];
        		} else if (i == n - 1) {
        			dp[i][j] = dp[i][j + 1] + arr[i][j];
        		} else if (j == m - 1) {
        			dp[i][j] = dp[i + 1][j] + arr[i][j];
        		} else {
        			dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
        		}
        	}
        }
        
        System.out.println(dp[0][0]);
    }

}
