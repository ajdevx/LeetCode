// Last updated: 15/09/2025, 19:34:36
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    int maxI=0;
    for(int i =0 ;i<arr.length ; i++){
        if(arr[i]> arr[maxI]){
            maxI=i;
        }
    } return maxI;   
    }
}