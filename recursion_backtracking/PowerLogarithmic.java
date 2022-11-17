/**
 * https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-logarithmic-official/ojquestion
 */
package recursion_backtracking;

import java.util.Scanner;

public class PowerLogarithmic {
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
    	int sn = power(x, n / 2);
    	int s = sn * sn;
    	if (n % 2 != 0) {
    		s = s * x;
    	}
    	return s;
    	
    }
}
