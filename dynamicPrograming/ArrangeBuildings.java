/**
 * https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/arrange-buildings-official/ojquestion
 */
package dynamicPrograming;

import java.io.*;
import java.util.*;

public class ArrangeBuildings {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		scan.close();
		
		long noBuilding = 1;
		long oneBuilding = 1;
		
		for (long i = 2; i <= n; i++) {
			long temp = oneBuilding;
			oneBuilding = noBuilding;
			noBuilding = temp + noBuilding;
		}
		System.out.println((noBuilding + oneBuilding) * (noBuilding + oneBuilding));
	}

}
