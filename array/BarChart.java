/**
 * https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion
 */
package array;

import java.io.*;
import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]= scan.nextInt();
    }
    scan.close();
    int max = arr[0];
    for (int i =1 ; i < n; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }        
    }
    
    for (int i = 0; i < max; i++) {
        for (int j = 0; j < n; j++) {
            
        
        if(max-arr[j] <= i) {
            System.out.print("*	");
        }
        else {
            System.out.print("	");
        }
        }
        System.out.println();
    }
 }

}
