/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion
 */

package array;

import java.io.*;
import java.util.*;

public class SubsetsOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = scan.nextInt();
    }
    scan.close();
    int m = (int) Math.pow(2, n);
    for (int i = 0; i < m; i++) {
        int temp = i;
        String set = "";
        for (int j = n - 1; j >= 0; j--) {
            int rem = temp % 2;
            temp = temp / 2;
            if (rem == 0) {
                set = "-" + "	" + set;
            }
            else {
                set = a[j] + "	" + set;
            }
        }
        System.out.println(set);
    }
 }

}