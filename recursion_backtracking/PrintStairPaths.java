/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-stair-paths-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintStairPaths {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		printStairPaths(s, "");
    }

    public static void printStairPaths(int n, String path) {
    	
    	if (n == 0) {
    		System.out.println(path);
    		return;
    	}
    	else if (n < 0) {
    		return;
    	}
    	printStairPaths(n - 1, path + "1");
    	printStairPaths(n - 2, path + "2");
    	printStairPaths(n - 3, path + "3");
    }

}
