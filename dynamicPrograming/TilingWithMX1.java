/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/tiling2-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class TilingWithMX1 {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int m = scan.nextInt();
    	scan.close();
    	int dp[] = new int[n + 1];
    	for (int i = 1; i <= n; i++) {
    		if (i < m) {
    			dp[i] = 1;
    		} else if (i == m) {
    			dp[i] = 2;
    		} else {
    			dp[i] = dp[i - 1] + dp[i - m];
    		}
    	}
    	
    	System.out.println(dp[n]);
    }
}
