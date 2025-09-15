// Last updated: 15/09/2025, 19:35:34
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if(target == nums[mid]) return mid;

            else if(nums[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return l;
    }
}