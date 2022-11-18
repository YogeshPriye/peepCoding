/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span-of-array-official/ojquestion
 */

package array;

import java.io.*;
import java.util.*;

public class SpanOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
    }
    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    
    int span = max-min;
    System.out.println(span);
 }

}
