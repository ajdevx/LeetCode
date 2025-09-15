// Last updated: 15/09/2025, 19:34:46
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sumM = 0;

        //finding sum of first kth element in array
        for(int i=0; i<k ; i++){
            sumM += nums[i];
        }
        //initilizing values

        int left = 0;
        int right = k-1;
        int n = nums.length-1;
        double sumT = sumM;
        
        //writing sliding window

        while( right!= n){
            sumT = sumT -nums[left];
            left++;
            right++;
            sumT = sumT+nums[right];
            sumM = Math.max(sumM,sumT);
        }
        return sumM/k;


    }
}