package string;
import java.io.*;
import java.util.*;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {

	public static String solution(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for (int i = 1 ; i < str.length(); i++) {
			int n = str.charAt(i) - str.charAt(i - 1);
			sb.append(n);
			sb.append(str.charAt(i));
			
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}