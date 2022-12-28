/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-sell-stocks-transaction-fee-ita-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class BuyAndSellStocsTransactionFeeITA {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
        	arr[i] = scan.nextInt();
        }
        
        int fee = scan.nextInt();
        scan.close();
        
        int bsp = -arr[0];
        int ssp = 0;
        
        for (int i = 1; i < n ; i++) {
        	int nbsp = 0;
        	int nssp = 0;
        	
        	if (ssp - arr[i] > bsp) {
        		nbsp = ssp - arr[i];
        	} else {
        		nbsp = bsp;
        	}
        	
        	if (bsp + arr[i] - fee > ssp) {
        		nssp = bsp + arr[i] - fee;
        	} else {
        		nssp = ssp;
        	}
        	
        	bsp = nbsp;
        	ssp = nssp;
        }
        
        System.out.println(ssp);
    }

}
