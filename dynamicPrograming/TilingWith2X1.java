/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/tiling1-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class TilingWith2X1 {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	scan.close();
    	int dp[] = new int[n + 1];
    	dp[1] = 1;
    	dp[2] = 2;
    	
    	for (int i = 3; i <= n; i++) {
    		dp[i] = dp[i - 1] + dp[i - 2];
    	}
    	
    	System.out.println(dp[n]);
    }
}
