/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-cooldown-ita-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class BuyAndSellStocsCooldownITA {

    public static void main(String[] args) throws Exception {
       
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	
    	int arr[] = new int[n];
    	
    	for (int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    	}
    	
    	int bsp = -arr[0];
    	int ssp = 0;
    	int csp = 0;
    	
    	for (int i = 1; i < n; i++ ) {
    		int nbsp = 0;
    		int nssp = 0;
    		int ncsp = 0;
    		if (csp - arr[i] > bsp) {
    			nbsp = csp - arr[i];
    		} else {
    			nbsp = bsp;
    		}
    		
    		if (bsp + arr[i] > ssp) {
    			nssp = bsp + arr[i];
    		} else {
    			nssp = ssp;
    		}
    		
    		if (ssp > csp) {
    			ncsp = ssp;
    		} else {
    			ncsp = csp;
    		}
    		
    		bsp = nbsp;
    		ssp = nssp;
    		csp = ncsp;
    		
    	}
    	
    	System.out.println(ssp);
    }

}
