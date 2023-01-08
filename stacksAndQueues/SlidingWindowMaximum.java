/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/sliding-window=maximum-official/ojquestion
 */
package stacksAndQueues;
import java.io.*;
import java.util.*;

public class SlidingWindowMaximum{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    Stack<Integer> st = new Stack<>();
    int arr[] = new int[n];
    st.push(n - 1);
    arr[n - 1] = n;
    for (int i = a.length - 2; i >= 0; i--) {
    	while (st.size() > 0 && a[i] >= a[st.peek()]) {
    		st.pop();
    	}
    	if (st.size() == 0 ) {
    		arr[i] = n;
    	} else {
    		arr[i] = st.peek();
    	}
    	st.push(i);
    }
    int j = 0;
    for (int i = 0; i <= n - k; i++) {
    	if (j < i) {
    		j = i;
    	}
    	while(arr[j] < i + k) {
    		j = arr[j];
    	}
    	System.out.println(a[j]);
    }    
 }
}