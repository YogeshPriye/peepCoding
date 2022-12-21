/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-minimum-moves-official/ojquestion
 */

package dynamicPrograming;

import java.io.*;
import java.util.*;

public class ClimbStairsWithMinimumMoves {

    public static void main(String[] args) throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int arr[] = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    	}
    	scan.close();
    	
    	Integer dp[] = new Integer[n + 1];
    	dp[n] = 0;
    	
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				int temp = 0;
				int min = Integer.MAX_VALUE;
				for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
					if (dp[i + j] != null) {
						temp = dp[i + j];
						if (temp < min) {
							min = temp;
						}
					}
				}
				if (min != Integer.MAX_VALUE) {
					dp[i] = min + 1;
				}
			}
		}
    	
    	System.out.println(dp[0]);
        
    }

}
