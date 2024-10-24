//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
           int l=0;
           int r=v.length-1;
           int first=-1;
           int last=-1;
           
           //first occurance
           while(l<=r){
               int mid=(l+r)/2;
               if(v[mid]==x){
                   first=mid;
                   r=mid-1;
               }else if(v[mid]>x){
                   r=mid-1;
               }else{
                   l=mid+1;
               }
           }
           
           l=0;
           r=v.length-1;
           //last occurance
           while(l<=r){
               int mid=(l+r)/2;
               if(v[mid]==x){
                   last=mid;
                   l=mid+1;
               }else if(v[mid]>x){
                   r=mid-1;
               }else{
                   l=mid+1;
               }
           }
           return new pair(first,last);
    }
}