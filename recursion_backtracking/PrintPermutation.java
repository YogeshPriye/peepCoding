/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-permutations-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintPermutation {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.next();
    	printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
    	
    	if (str.length() == 0) {
    		System.out.println(asf);
    		return;
    	}
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		String lStr = str.substring(0, i);
    		String rStr = str.substring(i + 1);
    		String res = lStr + rStr;
    		printPermutations(res, asf + ch);
    	}
        
    }

}
