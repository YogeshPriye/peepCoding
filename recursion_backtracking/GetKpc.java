/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-kpc-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class GetKpc {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
		String s = scan.next();
		List<String> lst = getKPC(s);
		System.out.println(lst);
    }
    static String val[] = {".;","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
    	
    	if (str.length() == 0) {
    		ArrayList<String> bres = new ArrayList<String>();
    		bres.add("");
    		return bres;
    	}
    	
    	char c = str.charAt(0);
    	String sb = str.substring(1);
    	ArrayList<String> res = getKPC(sb);
    	ArrayList<String> nres = new ArrayList<String>();
    	
    	String eVal = val[c - '0'];
    	for (int i = 0; i < eVal.length(); i++) {
    		char ecVal = eVal.charAt(i);
    		for (String nVal: res) {
    			nres.add(ecVal + nVal);
    		}
    	}
    	
    	
        return nres;
    }

}
