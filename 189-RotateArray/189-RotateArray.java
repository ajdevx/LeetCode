// Last updated: 15/09/2025, 19:35:12
class Solution {
    void swap(int l, int r, int [] arr){
        while(r>l){
            int temp= arr[l];
            arr[l]= arr[r];
            arr[r]=temp;
            r--;
            l++;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k% nums.length;
        swap(0,(nums.length-1)-k,nums);
        swap(nums.length-k,nums.length-1,nums);
        swap(0,nums.length-1,nums);
       
}
}