/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fibonacci-dp-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) throws Exception {
	    
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int fab = fibb(n, new int[n + 1]);
		System.out.println(fab);
	}
	
	public static int fibb(int n, int qb[]) {
		
		if (n == 0 || n == 1) {
			return n;
		}
		
		if (qb[n] != 0) {
			return qb[n];
		}
		
		int fab1 = fibb(n - 1, qb);
		int fab2 = fibb(n - 2, qb);
		int fab3 = fab1 + fab2;
		
		qb[n] = fab3;
		return fab3;
	}
	
}
