/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-a+b+c+subsequences-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class CountabcSubsequences {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.next();
    	scan.close();
    	int a = 0;
    	int ab = 0;
    	int abc = 0;
    	
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		
    		if (ch == 'a') {
    			a = 2 * a + 1;
    		} else if (ch == 'b') {
    			ab = 2 * ab + a;
    		} else if (ch == 'c') {
    			abc = 2 * abc + ab;
    		}
    	}
    	
    	System.out.println(abc);
    }
}
