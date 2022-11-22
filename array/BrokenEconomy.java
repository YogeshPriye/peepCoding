/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion
 */
package array;

import java.io.*;
import java.util.*;

public class BrokenEconomy{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
    }
    int d = scan.nextInt();
    int l = 0;
    int h = n - 1;
    while (l <= h) {
        int m = (l + h) / 2;
        if (d < arr[m]) {
            h = m - 1;
        }
        else if (d > arr[m]) {
            l = m + 1;
        }
        else {
            System.out.println(arr[m]);
            break;
        }
    }
    if (h < 0) {
        System.out.println(arr[0]);
    }
    else if (l > (n - 1)) {
        System.out.println(arr[n - 1]);
    }
    else {
        System.out.println(arr[l]);
        System.out.println(arr[h]);
    }
 }

}
