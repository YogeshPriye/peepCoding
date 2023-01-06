/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/stock-span-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class StockSpan{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
	 int a[] = new int[arr.length];
	 Stack<Integer> st = new Stack<>();
	 for (int i = 0; i < arr.length; i++) {
		 while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
			 st.pop();
		 }
		 if (st.size() == 0) {
			 a[i] = i + 1;
		 } else {
			 a[i] = i - st.peek();
		 }
		 st.push(i);
	 }
   return a;
 }

}
