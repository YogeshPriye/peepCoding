/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/coin-change-combination-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class CoinChangeCombination {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int amt = scan.nextInt();
		scan.close();
		
		int dp[] = new int[amt + 1];
		dp[0] = 1;
		for (int j = 0; j < n; j++) {
			for (int i = 1; i < dp.length; i++) {
				if (arr[j] <= i) {
					dp[i] = dp[i] + dp[i - arr[j]];
				}
			}
		}
		
		System.out.println(dp[amt]);
	}
}