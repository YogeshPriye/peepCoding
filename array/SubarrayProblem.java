/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subarray-problem-official/ojquestion
 */

package array;

import java.io.*;
import java.util.*;

public class SubarrayProblem{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]= scan.nextInt();
    }
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            for (int k = i; k <= j; k++) {
                System.out.print (arr[k] + "	");
            }
            System.out.println();
        }
    }
    scan.close();
 }

}