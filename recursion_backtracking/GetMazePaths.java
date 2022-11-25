/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-paths-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		List<String> lst = getMazePaths(1, 1, n, m);
		System.out.println(lst);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    	
    	if (sr == dr && sc == dc) {
    		ArrayList<String> bres = new ArrayList<String>();
    		bres.add("");
    		return bres;
    	}
    	ArrayList<String> h = new ArrayList<String>();
    	ArrayList<String> v = new ArrayList<String>();
    	if (sc < dc) {
    		h = getMazePaths(sr, sc + 1, dr, dc);
    	}
    	if (sr < dr) {
    		v = getMazePaths(sr + 1, sc, dr, dc);
    	}
    	ArrayList<String> res = new ArrayList<String>();
    	for (String val : h) {
    		res.add(h + val);
    	}
    	for (String val : v) {
    		res.add(v + val);
    	}
        return res;
    }

}
