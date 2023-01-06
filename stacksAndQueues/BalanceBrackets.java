/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/balanced-brackets-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class BalanceBrackets {

	public static void main(String[] args) throws Exception {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();
    	
    	Stack<Character> st = new Stack<>();
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		if (st.size() == 0) {
    			if (ch == ')' || ch == ']' || ch == '}') {
    				System.out.println(false);
    				return;
    			}
    		}
    		if (ch == '(' || ch == '[' || ch == '{') {
    			st.push(ch);
    		}
    		else if (ch == ')') {
    			if (st.peek() == '(') {
    				st.pop();
    			} else {
    				System.out.println(false);
    				return;
    			}
    		}
    		else if (ch == '}') {
    			if (st.peek() == '{') {
    				st.pop();
    			} else {
    				System.out.println(false);
    				return;
    			}
    		}
    		else if (ch == ']') {
    			if (st.peek() == '[') {
    				st.pop();
    			} else {
    				System.out.println(false);
    				return;
    			}
    		}
    	}
		if (st.size() != 0)
		{
			System.out.println(false);
		} else {
			System.out.println(true);
		}
    }

}
