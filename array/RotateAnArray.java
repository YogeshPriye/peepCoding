/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/rotate-an-array-official/ojquestion
 */
package array;

import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int b[] = new int[a.length];
    if (k < 0) {
        k = k % a.length;
        k = k - (k * 2);
        for (int i = 0; i < a.length; i++) {
            int j = i;
            if (i - k < 0) {
                j = (i - k) + a.length;
            }
            else {
                j = i - k;
            }
            b[j] = a[i];
        }
    }
    else if (k > 0) {
        k = k % a.length;
        for (int i = 0; i < a.length; i++) {
            int j = i;
            if (i + k > a.length - 1) {
                j = (i + k) - a.length;
            }
            else {
                j = i + k;
            }
            b[j] = a[i];
        }
    }
    if (k != 0) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
