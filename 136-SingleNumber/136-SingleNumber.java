// Last updated: 15/09/2025, 19:35:20
class Solution {
    public int singleNumber(int[] arr) {
      int XOR=0;
      for(int i=0;i<arr.length;i++){
        XOR = XOR^arr[i];
      }
      return XOR; 
    }
}