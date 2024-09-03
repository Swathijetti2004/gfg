//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> f=new Stack<>();
        for(char c:S.toCharArray()){
            f.push(c);
        }
        StringBuffer ans=new StringBuffer();
        while(!f.isEmpty()){
            ans.append(f.pop());
        }
        return ans.toString();
    }

}