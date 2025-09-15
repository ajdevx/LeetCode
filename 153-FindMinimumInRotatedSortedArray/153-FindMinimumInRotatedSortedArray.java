// Last updated: 15/09/2025, 19:35:16
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            min = Math.min(nums[i],min);
        }
        return min;
    }
}