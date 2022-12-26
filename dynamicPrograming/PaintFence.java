/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-fence-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class PaintFence {

    public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int k = scan.nextInt();
    	scan.close();
    	
    	long sameVal = k * 1;
    	long diffVal = k * (k - 1);
    	long total = sameVal + diffVal;
    	for (int i = 3; i <= n; i++) {
    		sameVal = diffVal * 1;
    		diffVal = total * (k - 1);
    		total = sameVal + diffVal;
    	}
    	
    	System.out.println(total);
    }
}
