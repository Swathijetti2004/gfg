//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int j=0;j<n;j++){
            if(a[j]==0){
                zeros++;
            }else if(a[j]==1){
                ones++;
            }else{
                twos++;
            }
        }
        int i=0;
        while(zeros!=0){
            a[i++]=0;
            zeros--;
        }
        while(ones!=0){
            a[i++]=1;
            ones--;
        }
         while(twos!=0){
            a[i++]=2;
            twos--;
        }
    }
    
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends