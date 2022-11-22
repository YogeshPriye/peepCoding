/**
 * https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/toggle-case-official/ojquestion
 */
package string;
import java.io.*;
import java.util.*;

public class Toggle_Case {

	public static String toggleCase(String str){
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			int n = (int)str.charAt(i);
			if (n >= 97 && n <= 122) {
				n = n - 32;
				sb.setCharAt(i, (char)n);
			}
			else {
				n = n + 32;
				sb.setCharAt(i, (char)n);
			}
		}


		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
