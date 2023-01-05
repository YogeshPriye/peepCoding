/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/duplicate-brackets-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class DublicateBrackets {

    public static void main(String[] args) throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	String str = scan.nextLine();
    	
    	Stack<Character> st = new Stack<>();
    	boolean result = false;
    	for (int i = 0; i < str.length(); i++) {
    		if (st.size() == 0) {
    			st.push(str.charAt(i));
    		}
    		if (str.charAt(i) == ')') {
    			if (st.peek() == '(') {
    				result = true;
    				break;
    			}
    			else {
    				while (st.peek() != '(') {
    					st.pop();
    				}
    				st.pop();
    			}
    		} else {
    			st.push(str.charAt(i));
    		}
    	}
    	
    	System.out.println(result);
    	
    }

}