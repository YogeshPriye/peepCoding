/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-evaluation-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class InfixEvaluation{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();
    String str = "+-*/()";
    for (int i = 0; i < exp.length(); i++) {
    	char ch = exp.charAt(i);
    	if (str.contains(String.valueOf(ch))) {
    		if (st2.size() == 0) {
    			st2.push(ch);
    		} else if (st2.peek() == '(') {
    			st2.push(ch);
    		}
    		else if (ch == '(') {
    			st2.push(ch);
    		}else if (ch == ')') {
    			while (st2.peek() != '(') {
    				int val1 = st1.pop();
        			int val2 = st1.pop();
        			int total = calcs(val1, val2, st2.pop());
        			st1.push(total);
    			}
    			st2.pop();
    		} else if (st2.peek() == '*' || st2.peek() == '/') {
    			int val1 = st1.pop();
    			int val2 = st1.pop();
    			int total = calcs(val1, val2, st2.pop());
    			st1.push(total);
    			st2.push(ch);
    		} else if (ch == '*' || ch == '/') {
    			st2.push(ch);
    		} else if (st2.peek() == '+' || st2.peek() == '-') {
    			int val1 = st1.pop();
    			int val2 = st1.pop();
    			int total = calcs(val1, val2, st2.pop());
    			st1.push(total);
    			st2.push(ch);
    		}
    	} else if (exp.charAt(i) != ' '){
    		st1.push(Integer.valueOf(String.valueOf(ch)));
    	}

    		
    }
    while (st1.size() > 1) {
    	int val1 = st1.pop();
    	int val2 = st1.pop();
    	int total = calcs(val1, val2, st2.pop());
    	st1.push(total);
    }
	System.out.println(st1.peek());
    
 }
	public static int calcs(int val1, int val2, char c) {
		int total = 0;
		if (c == '*') {
			total = val1 * val2;
		} else if (c== '/') {
			total = val2 / val1;
		} else if (c == '-') {
			total = val2 - val1;
		} else if ( c == '+') {
			total = val1 + val2;
		}
		return total;
	}
}
