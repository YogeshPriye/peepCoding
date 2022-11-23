/**
 * https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/first-index-official/ojquestion
 */

package recursion_backtracking;

import java.util.Scanner;

public class FirstIndex {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
    	int idx = scan.nextInt();
    	int arr[] = new int[idx];
    	for (int i = 0; i < idx; i++) {
    		arr[i] = scan.nextInt();
    	}
    	int x = scan.nextInt();
    	System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
    	
    	if (idx == arr.length) {
    		return -1;
    	}
    	if (arr[idx] == x) {
    		return idx;
    	}
    	else {
        	int indx = firstIndex(arr, idx + 1, x);
    		return indx;
    	}
    	
    }
}
