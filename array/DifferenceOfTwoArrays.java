/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference-of-two-arrays-official/ojquestion
 */
package array;

import java.io.*;
import java.util.*;

public class DifferenceOfTwoArrays{

public static int[] diffArray(int[] arr1, int[] arr2, int max, int min) {
    int diff = max - min;
    boolean carry = false;
    for (int i = max - 1; i >= 0; i--) {
        if(carry) {
            if (arr2[i] <= 0) {
                arr2[i] = 9;
            }
            else {
                arr2[i] = arr2[i] - 1;
                carry = false;
            }
        }
        if ((i - diff) >= 0) {
            if (arr2[i] - arr1[i-diff] < 0) {
                arr2[i] = arr2[i] + 10;
                carry = true;
            }
            arr2[i] = arr2[i] - arr1[i-diff];
        }
    }
    return arr2;
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int arr1[] = new int[n1];
    for (int i = 0; i < n1; i++) {
        arr1[i] = scan.nextInt();
    }
    int n2 = scan.nextInt();
    int arr2[] = new int[n2];
    for (int i = 0; i < n2; i++) {
        arr2[i] = scan.nextInt();
    }
    int max = n1;
    int min = n2;
    int arr3[];
    if (min > max) {
        max = n2;
        min = n1;
        arr3 = diffArray(arr1, arr2, max, min);
    }
    else {
        arr3 = diffArray(arr2, arr1, max, min);
    }
    boolean found = false;
    for (int i = 0; i < (max-min); i++) {
        if (arr3[i] == 0 && !found) {
            continue;
        }
        found = true;
        System.out.println(arr3[i] + "  ");
    }
    for (int i = (max-min); i < max; i++) {
        System.out.println(arr3[i]);
    }
    
    
 }

}
