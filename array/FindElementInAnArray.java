/**
 * pepcoding.com/resources/online-java-foundation/function-and-arrays/find-element-in-array-official/ojquestion
 */

package array;

import java.io.*;
import java.util.*;

public class FindElementInAnArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
    }
    int d = scan.nextInt();
    boolean elementFound = false;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == d) {
            elementFound = true;
            System.out.println(i);
            break;
        }
    }
    if (!elementFound) {
        System.out.println("-1");
    }
 }

}
