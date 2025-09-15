// Last updated: 15/09/2025, 19:35:13
class Solution {
    public int majorityElement(int[] arr) {
        int el=arr[0];
        int pow=1; 
        for(int i=1;i<arr.length;i++){
            if(el==arr[i]){
                pow++;
            }
            else pow--;
            if(pow==0){
                el = arr[i];
                pow=1;
            }
            
     } return el;  
    }
}