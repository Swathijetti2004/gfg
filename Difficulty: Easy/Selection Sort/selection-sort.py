#User function Template for python3

class Solution: 
    def select(self, arr, i):
        # code here 
        pass
    
    def selectionSort(self, arr,n):
        #code here
        for i in range(0,n):
            minimum=i
            for j in range(i,n):
                if(arr[minimum]>arr[j]):
                    minimum=j
            # if(minimum!=i)
            arr[minimum],arr[i]=arr[i],arr[minimum]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        Solution().selectionSort(arr, n)
        for i in range(n):
            print(arr[i],end=" ")
        print()
# } Driver Code Ends