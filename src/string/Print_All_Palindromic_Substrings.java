package string;
import java.io.*;
import java.util.*;

public class Print_All_Palindromic_Substrings {

	public static void solution(String str){
		for (int i = 0; i < str.length(); i++) {
		    for (int j = i + 1; j <= str.length(); j++) {
		        StringBuilder sb = new StringBuilder(str.substring(i, j));
		        String s1 = sb.toString();
		        String s2 = sb.reverse().toString();
		        if (s1.equals(s2)) {
		        	System.out.println(s1);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}