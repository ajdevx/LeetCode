// Last updated: 15/09/2025, 19:33:56
class Solution {
    
    public int[] rearrangeArray(int[] arr) {
        int[] res = new int[arr.length];    
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                res[pos]=arr[i];
                pos+=2;
            }
            else{
               res[neg]=arr[i];
               neg+=2;
            }
        } return res;
    }
}