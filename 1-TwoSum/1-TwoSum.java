// Last updated: 15/09/2025, 19:35:47
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int ele = 0;
        HashMap <Integer, Integer> mp = new HashMap<> ();
        for(int i = 0; i<nums.length; i++) {
            ele = target - nums[i];
            if(mp.containsKey(ele)){
                res[0] = i;
                res[1] = mp.get(ele);
            }else{
                mp.put(nums[i],i);
            }
        }
        return res;
    }
}