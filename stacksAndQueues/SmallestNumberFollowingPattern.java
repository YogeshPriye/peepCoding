/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/smallest-number-following-pattern-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class SmallestNumberFollowingPattern{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    Stack<Integer> st = new Stack<Integer>();
    int n = 1;
    for (int i = 0; i < str.length(); i++) {
    	if (str.charAt(i) == 'd') {
    		st.push(n);
    		n++;
    	} else {
    		st.push(n);
    		n++;
    		while (st.size() > 0) {
    			System.out.print(st.pop());
    		}
    	}
    }
    st.push(n);
    while (st.size() > 0) {
		System.out.print(st.pop());
	}
 }
}
