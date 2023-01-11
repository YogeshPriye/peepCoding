/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/prefix-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class PrefixEvaluationConversions{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> vs = new Stack<>();
    Stack<String> post = new Stack<>();
    Stack<String> infi = new Stack<>();
    String str = "+-/*()";
    for (int i = exp.length() - 1; i >= 0; i--) {
    	char c = exp.charAt(i);
    	if (str.contains(String.valueOf(c))) {
    		String val1 = infi.pop();
    		String val2 = infi.pop();
    		String val = "(" + val1 + String.valueOf(c) + val2 + ")";
    		infi.push(val);
    		val1 = post.pop();
    		val2 = post.pop();
    		val = val1 + val2 + String.valueOf(c);
    		post.push(val);
    		val1 = vs.pop();
    		val2 = vs.pop();
    		int res = calcs(Integer.parseInt(val1), Integer.parseInt(val2), c);
    		vs.push(String.valueOf(res));
    	} else {
    		vs.push(String.valueOf(c));
    		post.push(String.valueOf(c));
    		infi.push(String.valueOf(c));
    	}
    }
    System.out.println(vs.pop());
    System.out.println(infi.pop());
    System.out.println(post.pop());
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