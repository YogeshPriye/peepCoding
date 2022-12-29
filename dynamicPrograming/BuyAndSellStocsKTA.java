/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-kta-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class BuyAndSellStocsKTA {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
        	arr[i] = scan.nextInt();
        }
        
        int k = scan.nextInt();
        scan.close();
        
        /*int dp[][] = new int[k + 1][n];
        
        for (int i = 1; i <= k; i++) {
        	for (int j = 1; j < n; j++) {
        		int max = dp[i][j - 1];
        		
        		for (int m = 0; m < j; m++) {
        			int p1 = dp[i - 1][m];
        			int p2 = arr[j] - arr[m];
        			
        			if (p1 - p2 > max) {
        				max = p1 - p2;
        			}
        		}
        		dp[i][j] = max;
        	}
        }
        
        System.out.println(dp[k][n - 1]);*/
        
		// Optimized
		int dp[][] = new int[k + 1][n];

		for (int i = 1; i <= k; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 1; j < n; j++) {
				if (dp[i - 1][j - 1] - arr[j - 1] > max) {
					max = dp[i - 1][j - 1] - arr[j - 1];
				}
				
				if (max + arr[j] > dp[i][j - 1]) {
					dp[i][j] = max + arr[j];
				} else {
					dp[i][j] = dp[i][j - 1];
				}
			}
		}

		System.out.println(dp[k][n - 1]);

	}

}
