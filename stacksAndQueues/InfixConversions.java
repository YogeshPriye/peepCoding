/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-conversions-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class InfixConversions{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> pre = new Stack<>();
    Stack<Character> opt = new Stack<>();
    Stack<String> post = new Stack<>();
    String str = "+-/*()";
    for (int i = 0 ; i < exp.length(); i++) {
    	char c = exp.charAt(i);
    	if (str.contains(String.valueOf(c))) {
    		if (opt.size() == 0) {
    			opt.push(c);
    		} else if (opt.peek() == '(') {
    			opt.push(c);
    		} else if (c == '(') {
    			opt.push(c);
    		} else if (c == ')') {
    			while (opt.peek() != '(') {
    				String val2 = pre.pop();
        			String val1 = pre.pop();
        			String optVal = String.valueOf(opt.pop());
        			String val = optVal + val1 + val2;
        			pre.push(val);
        			val2 = post.pop();
        			val1 = post.pop();
        			val = val1 + val2 + optVal;
        			post.push(val);
    			}
    			opt.pop();
    		} else if (opt.peek() == '*' || opt.peek() == '/') {
    			String val2 = pre.pop();
    			String val1 = pre.pop();
    			String optVal = String.valueOf(opt.pop());
    			String val = optVal + val1 + val2;
    			pre.push(val);
    			val2 = post.pop();
    			val1 = post.pop();
    			val = val1 + val2 + optVal;
    			post.push(val);
    			opt.push(c);
    			
    		} else if (c == '*' || c == '/') {
    			opt.push(c);
    		} else if (c == '+' || c == '-') {
    			while (opt.size() > 0 && opt.peek() != '(') {
    				String val2 = pre.pop();
        			String val1 = pre.pop();
        			String optVal = String.valueOf(opt.pop());
        			String val = optVal + val1 + val2;
        			pre.push(val);
        			val2 = post.pop();
        			val1 = post.pop();
        			val = val1 + val2 + optVal;
        			post.push(val);
    			}
    			opt.push(c);
    		}
    	} else {
    		pre.push(String.valueOf(c));
    		post.push(String.valueOf(c));
    	}
    }
    while (opt.size() > 0) {
    	String val2 = pre.pop();
		String val1 = pre.pop();
		String optVal = String.valueOf(opt.pop());
		String val = optVal + val1 + val2;
		pre.push(val);
		val2 = post.pop();
		val1 = post.pop();
		val = val1 + val2 + optVal;
		post.push(val);
    }
    System.out.println(post.pop());
    System.out.println(pre.pop());
 }
}