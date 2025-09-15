// Last updated: 15/09/2025, 19:35:23
class Solution {
    public int maxProfit(int[] arr) {
     int max=0;
     int small=0;
     int big=1;
     for(int i=0;i<arr.length-1;i++){
        if(arr[big]-arr[small]<0){
            small=big;
            big++;
        } 
        else {
            if(arr[big]-arr[small]>max){
                 max= arr[big]-arr[small];
            }
            big++;
        }

     }  return max; 
    }
}