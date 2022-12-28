/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-ota-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class BuyAndSellStocsOTA {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int arr[] = new int[n];
        /*int min = Integer.MAX_VALUE;
        int minPosition = 0;
        for (int i = 0; i < n; i++) {
        	arr[i] = scan.nextInt();
        	if (min > arr[i]) {
        		min = arr[i];
        		minPosition = i;
        	}
        }
        int max = 0;
        for (int i = minPosition + 1; i < n; i++) {
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        }
        
        int profit = 0;
        if (max != 0 && max > arr[minPosition]) {
        	profit = max - arr[minPosition];
        }
        
        System.out.println(profit);*/
        //Wrong Ans
        
        //Correct Ans
        /*for (int i = 0; i < n; i++) {
        	arr[i] = scan.nextInt();
        }
        int maxProfit = 0;
        for (int i = 0; i < n - 1 ; i++) {
        	for (int j = i + 1; j < n; j++) {
        		if ((arr[j] - arr[i]) > maxProfit) {
        			maxProfit = arr[j] - arr[i];
        		}
        	}
        }
        
        System.out.println(maxProfit);*/
        
        //Better Solution
        for (int i = 0; i < n; i++) {
        	arr[i] = scan.nextInt();
        }
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n ; i++) {
        	if (minSoFar > arr[i]) {
        		minSoFar = arr[i];
        	} else if ((arr[i] - minSoFar) > maxProfit) {
        		maxProfit = arr[i] - minSoFar;
        	}
        }
        System.out.println(maxProfit);
        
    }

}
