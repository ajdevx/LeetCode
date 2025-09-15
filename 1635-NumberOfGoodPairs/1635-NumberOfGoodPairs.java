// Last updated: 15/09/2025, 19:34:17
class Solution {

    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],(mp.get(nums[i])+1));
            }
        }

        int count = 0;
        for(int feq : mp.values()){
            count = count + (feq * (feq-1))/2;
        }
        return count;

       

    }
}