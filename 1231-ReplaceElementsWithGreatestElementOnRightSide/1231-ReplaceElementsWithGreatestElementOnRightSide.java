// Last updated: 15/09/2025, 19:34:28
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;

        for(int i= n-1; i>=0 ; i--){
            int temp = arr[i];
            arr[i] = max;
            max =(int) Math.max(temp,max);
        }
        return arr;
        
    }
}