/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;
public class GetSubsequence {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		List<String> lst = gss(s);
		System.out.println(lst);
		
    }

    public static ArrayList<String> gss(String str) {
    	
    	if (str.length() == 0) {
    		ArrayList<String> bres = new ArrayList<String>();
    		bres.add("");
    		return bres;
    	}
    	
    	char c = str.charAt(0);
    	String sb = str.substring(1);
    	ArrayList<String> res = gss(sb);
    	
    	ArrayList<String> nres = new ArrayList<String>();
    	for (String val : res) {
    		nres.add("" + val);
    	}
    	for (String val : res) {
    		nres.add(c + val);
    	}
        return nres;
    }
}
