/**
 * https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/merge-overlapping-interval-official/ojquestion
 */
package stacksAndQueues;

import java.io.*;
import java.util.*;

public class MergeOverlappingInterval {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
    	Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
    	int sp = 0;
    	int ep = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i][0] <= arr[ep][1]) {
    			if (arr[i][1] > arr[ep][1]) {
    				ep = i;
    			}
    		} else {
    			System.out.println(arr[sp][0] + " " + arr[ep][1]);
    			sp = i;
    			ep = i;
    		}
    	}
    	System.out.println(arr[sp][0] + " " + arr[ep][1]);
    }

}
