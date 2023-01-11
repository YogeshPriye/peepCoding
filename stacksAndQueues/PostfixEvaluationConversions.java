/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/postfix-evaluation-conversions-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class PostfixEvaluationConversions{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> vs = new Stack<>();
    Stack<String> pre = new Stack<>();
    Stack<String> infi = new Stack<>();
    String str = "+-/*()";
    for (int i = 0; i < exp.length(); i++) {
    	char c = exp.charAt(i);
    	if (str.contains(String.valueOf(c))) {
    		String val2 = infi.pop();
    		String val1 = infi.pop();
    		String val = "(" + val1 + String.valueOf(c) + val2 + ")";
    		infi.push(val);
    		val2 = pre.pop();
    		val1 = pre.pop();
    		val = String.valueOf(c) + val1 + val2;
    		pre.push(val);
    		val2 = vs.pop();
    		val1 = vs.pop();
    		int res = calcs(Integer.parseInt(val1), Integer.parseInt(val2), c);
    		vs.push(String.valueOf(res));
    	} else {
    		vs.push(String.valueOf(c));
    		pre.push(String.valueOf(c));
    		infi.push(String.valueOf(c));
    	}
    }
    System.out.println(vs.pop());
    System.out.println(infi.pop());
    System.out.println(pre.pop());
 }
public static int calcs(int val1, int val2, char c) {
	if (c == '+') {
		return val1 + val2;
	} else if (c == '-') {
		return val1 - val2;
	} else if (c == '*') {
		return val1 * val2;
	} else if (c == '/') {
		return val1 / val2;
	}
	return 0;
}
}