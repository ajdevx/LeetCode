// Last updated: 15/09/2025, 19:34:09
class Solution {
    public boolean check(int[] arr) {
       int Countbr=0;
       int n= arr.length;
       for(int i=0;i<n;i++){
        if(arr[i]>arr[(i+1)%n]) Countbr++;
       } 
       return Countbr<=1; 
    }
}