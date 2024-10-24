//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            System.out.println(new Sol().search(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        if(n==0){
            return -1;
        }
        if(n==1){
            return arr[0];
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-2]!=arr[n-1]){
            return arr[n-1];
        }
        return -1;
    }
}