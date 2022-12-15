/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-maze-paths-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintMazePaths {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		printMazePaths(1, 1, n, m, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
    	
    	if (sr == dr && sc == dc) {
    		System.out.println(psf);
    		return;
    	}
    	if (sc < dc) {
    		printMazePaths(sr, sc + 1, dr, dc, psf + "h");
    	}
    	if (sr < dr) {
    		printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    	}
    	
    }

}
