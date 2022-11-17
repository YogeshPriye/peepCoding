/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-decreasing-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintIncreasingDecreasing {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        pdi(n);
    }

    public static void pdi(int n){
        
    	if (n == 0) {
    		return;
    	}
    	System.out.println(n);
    	pdi(n - 1);
    	System.out.println(n);
    }

}