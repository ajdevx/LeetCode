// Last updated: 15/09/2025, 19:34:52
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int CountM=0;
        int Count=0;
      
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]==1) {
                Count ++;
                if(Count>CountM) CountM=Count;
            
            }
            else Count=0;
            }
            return CountM;
        }
    }
