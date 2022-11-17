/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-zig-zag-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class PrintZigzag {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        pzz(n);
    }

    public static void pzz(int n){
        if (n == 1) {
        	System.out.print(1 + " " + 1 + " " + 1);
        	return;
        }
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(" " + n + " ");
        pzz(n - 1);
        System.out.print(" " + n);
    }

}
