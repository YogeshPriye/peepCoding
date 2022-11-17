/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-decreasing-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        
    	if (n == 0) {
    		return;
    	}
    	System.out.println(n);
    	printDecreasing(n - 1);
    }

}