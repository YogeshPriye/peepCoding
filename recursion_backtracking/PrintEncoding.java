/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-encodings-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintEncoding {

    public static void main(String[] args) throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	String str = scan.next();
    	printEncodings(str, "");
    }

    public static void printEncodings(String str, String asf) {
        
    	if (str.length() == 0) {
    		System.out.println(asf);
    		return;
    	}
    	else if (str.length() == 1) {
    		char ch = str.charAt(0);
    		if (ch == '0') {
    			return;
    		}
    		else {
    			int c = ch - '0';
    			char eCode = (char)('a' + c - 1);
    			System.out.println(asf + eCode);
    		}
    	}
    	else {
    		char ch = str.charAt(0);
    		String res = str.substring(1);
    		
    		if (ch == '0') {
    			return;
    		}
    		else {
    			int c = ch - '0';
    			char eCode = (char)('a' + c - 1);
    			printEncodings(res, asf + eCode);
    		}
    		
    		String ch12 = str.substring(0, 2);
    		String res2 = str.substring(2);
    		
    		int ch12v = Integer.parseInt(ch12);
    		if (ch12v <= 26) {
    			char eCode = (char)('a' + ch12v - 1);
    			printEncodings(res2, asf + eCode);
    		}
    	}
    }

}
