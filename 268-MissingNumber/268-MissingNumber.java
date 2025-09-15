// Last updated: 15/09/2025, 19:35:03
class Solution {
    public int missingNumber(int[] arr) {
        int SumD=0;
        int SumO=0;
     for(int i=0;i<=arr.length;i++){
           SumD+=i;
           if(i!=arr.length) SumO+=arr[i];
     }  
     return SumD-SumO; 
    }
}