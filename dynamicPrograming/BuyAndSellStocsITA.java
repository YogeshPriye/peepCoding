/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-ita-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class BuyAndSellStocsITA {

    public static void main(String[] args) throws Exception {
        
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int arr[] = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    	}
    	scan.close();
    	/*int minSoFar = Integer.MAX_VALUE;
    	int totalProfit = 0;
    	int maxProfit = 0;
    	for (int i = 0; i < n; i++) {
    		if (minSoFar >= arr[i]) {
    			minSoFar = arr[i];
    			totalProfit += maxProfit;
    			maxProfit = 0;
    		}
    		else if ((arr[i] - minSoFar) > maxProfit) {
    			maxProfit = arr[i] - minSoFar;
    		}
    	}
    	int res = totalProfit + maxProfit;
    	System.out.println(res);*/
    	
    	//Wrong Solution
    	
    	//Correct Solution
    	
    	int minSoFar = Integer.MAX_VALUE;
    	int totalProfit = 0;
    	int maxProfit = 0;
    	for (int i = 0; i < n; i++) {
    		if (minSoFar > arr[i]) {
    			minSoFar = arr[i];
    		}
    		else if ((arr[i] - minSoFar) > maxProfit) {
    			maxProfit = arr[i] - minSoFar;
    			totalProfit += maxProfit;
    			maxProfit = 0;
    			minSoFar = arr[i];
    		}
    	}
    	System.out.println(totalProfit);
    	
    	//Another Solution
    	
    	/*int sd = 0;
    	int bd = 0;
    	int profit = 0;
    	
    	for (int i = 1; i < n;  i++) {
    		if (arr[i] >= arr[i - 1]) {
    			sd++;
    		} else {
    			profit += arr[sd] - arr[bd];
    			sd = bd = i;
    		}
    	}
    	
    	profit += arr[sd] - arr[bd];
    	
    	System.out.println(profit);*/
    	
    	
    }

}
