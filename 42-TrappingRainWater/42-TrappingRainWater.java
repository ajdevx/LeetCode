// Last updated: 15/09/2025, 19:35:33
class Solution {
    public int trap(int[] height) {
      int n = height.length;
      
      //left maximim bar
      int left[] = new int[n];
      left[0] = height[0];
      for(int i=1; i<n ; i++){
      left[i] = (int) Math.max(left[i-1],height[i]);
      }  

       //right maximim bar
      int right[] = new int[n];
      right[n-1] = height[n-1];
      for(int i=n-2; i>=0 ; i--){
        right[i] = (int) Math.max(right[i+1],height[i]);
      }

      //calculating trapped rain water
      int water = 0;
      for(int i=0; i<n ;i++){
        water = water+ (int)Math.min(left[i],right[i])-height[i];
      } 
      return water; 
    }
}