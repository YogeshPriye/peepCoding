/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //System.out.println(countPathMemorized(n, new int[n + 1]));
        System.out.println(countPathTab(n));
        
    }
    public static int countPathMemorized(int n, int[] qb) {
    	if (n == 0) {
    		return 1;
    	}
    	else if (n < 0) {
    		return 0;
    	}
    	
    	if (qb[n] > 0) {
    		return qb[n];
    	}
    	int n1 = countPathMemorized(n -1, qb);
    	int n2 = countPathMemorized(n -2, qb);
    	int n3 = countPathMemorized(n -3, qb);
    	
    	int cp = n1 + n2 + n3;
    	qb[n] = cp;
    	return cp;
    }
    
    public static int countPathTab(int n) {
    	int dp[] = new int[n + 1];
    	
    	dp[0] = 1;
    	
    	for (int i = 1; i <= n; i++) {
    		if (i == 1) {
    			dp[i] = dp[i - 1];
    		}
    		else if (i == 2) {
    			dp[i] = dp[i - 1] + dp[i - 2];
    		}
    		else {
    			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    		}
    	}
    	
    	return dp[n];
    }

}