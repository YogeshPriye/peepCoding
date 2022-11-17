/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/factorial-official/ojquestion
 */
package recursion_backtracking;

import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
    	System.out.println(factorial(n));
    }

    public static int factorial(int n){
    	if (n == 0) {
    		return 1;
    	}
    	return n * factorial(n - 1);
    }

}