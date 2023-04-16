/**
 * https://www.pepcoding.com/resources/online-java-foundation/generic-tree/node-with-maximum-subtree-sum-official/ojquestion
 */
package genericTree;

import java.io.*;
import java.util.*;

public class NodeWithMaximumSubtreeSum {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }
  static int nodeData;
  static int sum = Integer.MIN_VALUE;
  public static int findMaxSum(Node node) {
	  
	  int tempSum = 0;
	  
	  for (Node child : node.children) {
		  tempSum += findMaxSum(child);
	  }
	  tempSum += node.data;
	  if (tempSum > sum) {
		  sum = tempSum;
		  nodeData = node.data;
	  }
	  return tempSum;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    findMaxSum(root);
    System.out.println(nodeData + "@" + sum);
  }

}