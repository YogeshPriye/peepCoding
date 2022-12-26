/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-house-many-colors-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class PaintHouseManyColors {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int k = scan.nextInt();
    	int arr[][] = new int[n][k];
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < k; j++)
    		arr[i][j] = scan.nextInt();
    	}
    	scan.close();
    	/*long dp[][] = new long[n][k];
    	for (int i = 0; i < arr[0].length; i++) {
    		dp[0][i] = arr[0][i];
    	}
    	for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				long min = Long.MAX_VALUE;
				for (int m = 0; m < arr[0].length; m++) {
					if (m == j) {
						continue;
					}
					min = Math.min(dp[i - 1][m], min);
				}
				dp[i][j] = arr[i][j] + min;
			}
		}
    	long min = Long.MAX_VALUE;
		for (int m = 0; m < arr[0].length; m++) {
			min = Math.min(dp[n - 1][m], min);
		}
    	System.out.println(min);*/
    	
    	//Optimize
    	long dp[][] = new long[n][k];
    	long least = Long.MAX_VALUE;
    	long sleast = Long.MAX_VALUE;
    	for (int i = 0; i < arr[0].length; i++) {
    		dp[0][i] = arr[0][i];
    		
    		if (arr[0][i] <= least) {
    			sleast = least;
    			least = arr[0][i];
    		} else if (arr[0][i] <= sleast) {
    			sleast = arr[0][i];
    		}
    	}
    	for (int i = 1; i < arr.length; i++) {
    		long nleast = Long.MAX_VALUE;
    		long nsleast = Long.MAX_VALUE;
			for (int j = 0; j < arr[0].length; j++) {
				if (least == dp[i - 1][j]) {
					dp[i][j] = sleast + arr[i][j];
				} else {
					dp[i][j] = least + arr[i][j];
				}
				
				if (dp[i][j] <= nleast) {
					nsleast = nleast;
					nleast = dp[i][j];
				} else if (dp[i][j] <= nsleast) {
					nsleast = dp[i][j];
				}
			}
			
			least = nleast;
			sleast = nsleast;
    	}
    	
    	System.out.println(least);
    }
    
}
