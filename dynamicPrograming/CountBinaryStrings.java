/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-binary-strings-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class CountBinaryStrings {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int endZeroCount = 1;
		int endOneCount = 1;
		
		for (int i = 2; i <= n; i++) {
			int temp = endZeroCount;
			endZeroCount = endOneCount;
			endOneCount = temp + endOneCount;
		}
		
		System.out.println(endOneCount + endZeroCount);

	}

}
