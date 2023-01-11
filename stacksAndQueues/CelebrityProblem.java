/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/celebrity-problem-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class CelebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
    	/*int count = 0;
    	int idx = 0;
    	boolean isUnknown = true;
    	for (int i = 0 ; i < arr.length; i++) {
    		isUnknown = true;
    		for (int j = 0; j < arr.length; j++) {
    			if (i != j) {
    				if (arr[i][j] != 0) {
    					isUnknown = false;
    					break;
    				}
    			}
    		}
    		if (isUnknown) {
    			idx = i;
    			count++;
    		}
    	}
    	if (count != 1) {
    		System.out.println("none");
    		return;
    	}
    	boolean isknown = true;
    	for (int i = 0; i < arr.length; i++) {
    		if (idx != i) {
    			if (arr[i][idx] != 1) {
    				isknown = false;
    				break;
    			}
    		}
    	}
    	if (isknown) {
    		System.out.println(idx);
    	} else {
    		System.out.println("none");
    	}
    	*/
    	// Optimized
    	Stack<Integer> st = new Stack<>();
    	for (int i = 0; i < arr.length; i++) {
    		st.push(i);
    	}
    	
    	while(st.size() >= 2) {
    		int i = st.pop();
    		int j = st.pop();
    		if (arr[i][j] == 1) {
    			// if i knows j => i is not celebrity
    			st.push(j);
    		} else {
    			// if i does not knows j => j is not celebrity
    			st.push(i);
    		}
    	}
    	int res = st.pop();
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (i != res) {
    			if (arr[i][res] == 0 || arr[res][i] == 1) {
    				System.out.println("none");
    				return;
    			}
    		}
    	}
    	System.out.println(res);
    	
    	
    	
    	
    	
    	
    }

}