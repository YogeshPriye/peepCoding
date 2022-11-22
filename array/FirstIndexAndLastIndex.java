/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/first-index-last-index-official/ojquestion
 */

package array;

import java.io.*;
import java.util.*;

public class FirstIndexAndLastIndex {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    int d = scan.nextInt();
    int l = 0;
    int h = n - 1;
    //int d = u - 1;
    while (l <= h) {
      int m = (l + h) / 2;
      if (d <= arr[m]) {
        h = m - 1;
      }
      else if (d > arr[m]) {
        l = m + 1;
      }
      /*else {
        l = m + 1;
        break;
      }*/
    }
    if (arr[l] == d) {
        System.out.println(l);
    }
    else {
        l = -1;
        System.out.println(l);
    }
    l = 0;
    h = n - 1;
    //d = u + 1;
    while (l <= h) {
      int m = (l + h) / 2;
      if (d < arr[m]) {
        h = m - 1;
      }
      else if (d >= arr[m]) {
        l = m + 1;
      }
      /*else {
        h = m - 1;
        break;
      }*/
    }
    if (arr[h] == d) {
        System.out.println(h);
    }
    else {
        h = -1;
        System.out.println(h);
    }
  }

}
