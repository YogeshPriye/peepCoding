/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-in-reverse/ojquestion
 */

package recursion_backtracking;

import java.util.Scanner;

public class DisplayArrayInReverse {

	public static void main(String[] args) throws Exception {
        
    	Scanner scan = new Scanner(System.in);
    	int idx = scan.nextInt();
    	int arr[] = new int[idx];
    	for (int i = 0; i < idx; i++) {
    		arr[i] = scan.nextInt();
    	}
    	displayArr(arr, idx);
    }

    public static void displayArr(int[] arr, int idx){
        
    	if (idx == 0) {
    		return;
    	}
    	System.out.println(arr[idx - 1]);
    	displayArr(arr, idx - 1);
    }
}
