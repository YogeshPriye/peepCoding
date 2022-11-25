/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-stair-paths-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		List<String> lst = getStairPaths(s);
		System.out.println(lst);
    }

    public static ArrayList<String> getStairPaths(int n) {
    	
    	if (n == 0) {
    		ArrayList<String> bres = new ArrayList<String>();
    		bres.add("");
    		return bres;
    	}
    	else if (n < 0) {
    		ArrayList<String> bres = new ArrayList<String>();
    		return bres;
    	}
    	ArrayList<String> p1 = getStairPaths(n - 1);
    	ArrayList<String> p2 = getStairPaths(n - 2);
    	ArrayList<String> p3 = getStairPaths(n - 3);
    	ArrayList<String> res = new ArrayList<String>();
    	
    	for (String val: p1) {
    		res.add(1 + val);
    	}
    	for (String val: p2) {
    		res.add(2 + val);
    	}
    	for (String val: p3) {
    		res.add(3 + val);
    	}
    	
        return res;
    }

}
