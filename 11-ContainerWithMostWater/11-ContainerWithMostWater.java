// Last updated: 15/09/2025, 19:35:40
class Solution {
    public int maxArea(int[] height) {
       int max = -1;
       int left = 0;
       int right =  height.length-1;
       while( left<right ){
        int dist = right-left;
        int minheight = (int) Math.min(height[left],height[right]);
        max = (int) Math.max(max, dist*minheight);

        if (height[left] < height[right]) left++;
        else right--;

       }
       return max;
    }
}