// Last updated: 15/09/2025, 19:34:01
class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int i = 0;
        int j = 1;
        
        while(j< nums.length-1){
            if(nums[i]<nums[j] && nums[j]>nums[j+1]
                ||
                nums[i]>nums[j] && nums[j]<nums[j+1]
            ){
                i=j;
                count++;
            }
            j++;
        }
        return count;
    }
}