// Last updated: 15/09/2025, 19:35:36
class Solution {
    public int removeDuplicates(int[] arr) {
     int i=0;
     for(int j=1;j<arr.length;j++){
        if(arr[j]!=arr[i]){
            arr[i+1]=arr[j];
            i++;
        } 

     } 
     return i+1;  
    }
}