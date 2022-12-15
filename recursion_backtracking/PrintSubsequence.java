/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	String s = scan.next();
    	printSS(s, "");

    }

    public static void printSS(String str, String ans) {
        
    	if (str.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	
    	char c = str.charAt(0);
    	String sbStr = str.substring(1);
    	printSS(sbStr, ans + c);
    	printSS(sbStr, ans + "");

    }

}