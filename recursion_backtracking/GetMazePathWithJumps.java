/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-path-with-jumps-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

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
    	ArrayList<String> res = new ArrayList<String>();
    	for (int i = 1; i <= (dc - sc); i++) {
    		ArrayList<String> hor = getMazePaths(sr, sc + i, dr, dc);
    		for (String val : hor) {
    			res.add("h" + i + val);
    		}
    	}
    	for (int i = 1; i <= (dr - sr); i++) {
    		ArrayList<String> ver = getMazePaths(sr + i, sc, dr, dc);
    		for (String val : ver) {
    			res.add("v" + i + val);
    		}
    	}
    	for (int i = 1; i <= (dc - sc) && i <= (dr - sr); i++) {
    		ArrayList<String> dig = getMazePaths(sr + i, sc + i, dr, dc);
    		for (String val : dig) {
    			res.add("d" + i + val);
    		}
    	}
        return res;
    }

}