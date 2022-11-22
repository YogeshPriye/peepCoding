/**
 * https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-permutations-of-a-string-iteratively-official/ojquestion
 */
package string;
import java.io.*;
import java.util.*;

public class Print_All_Permutations_Of_A_String_Iteratively {

	public static void solution(String str){
		int fact = 1;
		for (int i = str.length(); i >= 2; i--) {
			fact *= i;
		}
		for (int i = 0; i < fact; i++) {
			StringBuilder sb = new StringBuilder(str);
		      int temp = i;

		      for (int j = str.length(); j >= 1; j--) {
		        int q = temp / j;
		        int r = temp % j;

		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp = q;
		      }
		      System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}