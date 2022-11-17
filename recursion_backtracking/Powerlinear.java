/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-linear-official/ojquestion
 */
package recursion_backtracking;

import java.util.Scanner;

public class Powerlinear {
	public static void main(String[] args) throws Exception {
        
		Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
    	System.out.println(power(x, n));
    }

    public static int power(int x, int n){
    	if (n == 0)
    		return 1;
    	return x * power(x, n - 1);
    }
}
