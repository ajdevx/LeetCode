// Last updated: 15/09/2025, 19:35:09
class Solution {
    public boolean isPowerOfTwo(int n) {
     if(n<=0) return false;   
     if (n==1) return true;
     if(n%2!=0) return false;
     else return isPowerOfTwo(n/2);  
    }
}