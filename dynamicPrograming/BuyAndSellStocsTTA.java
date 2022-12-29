/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-sell-stocks-tta-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class BuyAndSellStocsTTA {

    public static void main(String[] args) throws Exception {
        
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	
    	int arr[] = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    	}
    	scan.close();
    	
    	int mpist = 0;
    	int leastsf = arr[0];
    	int dpmpisut[] = new int[n];
    	for (int i = 1; i < n; i++) {
    		if (arr[i] < leastsf) {
    			leastsf = arr[i];
    		}
    		
    		mpist = arr[i] - leastsf;
    		if (mpist > dpmpisut[i - 1]) {
    			dpmpisut[i] = mpist;
    		} else {
    			dpmpisut[i] = dpmpisut[i - 1];
    		}
    	}
    	
    	int mpibt = 0;
    	int maxat = arr[n - 1];
    	int dpr[] = new int[n];
    	for (int i = n - 2; i >= 0; i--) {
    		if (arr[i] > maxat) {
    			maxat = arr[i];
    		}
    		mpibt = maxat - arr[i];
        	if (mpibt > dpr[i - 1]) {
        		dpr[i] = mpibt;
        	} else {
        		dpr[i] = dpr[i + 1];
        	}
    	}
    	
    	int op = 0;
    	for (int i = 0; i < n; i++) {
    		if (dpmpisut[i] + dpr[i] > op) {
    			op = dpmpisut[i] + dpr[i];
    		}
    	}
    	
    	System.out.println(op);
    	
    }

}