/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-kpc-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintKpc {

    public static void main(String[] args) throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	String str = scan.next();
    	printKPC(str, "");

    }
    static String val[] = {".;","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf) {
        
    	if (str.length() == 0) {
    		System.out.println(asf);
    		return;
    	}
    	
    	char c = str.charAt(0);
    	String rem = str.substring(1);
    	
    	String eVal = val[c - '0'];
    	
    	for (int i = 0; i < eVal.length(); i++) {
    		char ch = eVal.charAt(i);
    		printKPC(rem, asf + ch);
    	}
    	
    }

}