/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sum-of-two-arrays-official/ojquestion
 */

package array;

import java.io.*;
import java.util.*;

public class SumOfTwoArrays{
    
public static int[] sumArr(int[] arr1, int[] arr2, int max, int min) {
    int diff = max - min;
    int carry = 0;
    for (int i = max -1 ; i >= 0; i--) {
    	if (i >= diff) {
    		arr2[i] = arr2[i] + arr1[i-diff] + carry;
    	}
    	else {
    		arr2[i] = arr2[i] + carry;
    	}
        carry = arr2[i] / 10;
        arr2[i] = arr2[i] % 10;
    }
    return arr2;
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int arr1[]= new int[n1];
    for (int i = 0; i < n1; i++) {
        arr1[i] = scan.nextInt();
    }
    int n2 = scan.nextInt();
    int arr2[] = new int[n2];
    for (int i = 0; i < n2; i++) {
        arr2[i] = scan.nextInt();
    }
    scan.close();
    int max = n1;
    int min = n2;
    int arr3[];
    if (min > max) {
        max = n2;
        min = n1;
        arr3 = sumArr(arr1, arr2, max, min);
    }
    else {
        arr3 = sumArr(arr2, arr1, max, min);
    }
    
    for(int i = 0; i < max; i++) {
        System.out.println(arr3[i]);
    }
 }

}
