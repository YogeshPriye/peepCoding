/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        
    	if (n == 0) {
    		return;
    	}
    	printIncreasing(n - 1);
    	System.out.println(n);
    }

}