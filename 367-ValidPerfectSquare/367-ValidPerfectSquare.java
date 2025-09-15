// Last updated: 15/09/2025, 19:34:58
class Solution {
    public boolean isPerfectSquare(int num) { 
        //normal loop method
        // if(num == 1) return true;
        // int s =  num/2;
        // for(int i =s;i>0;i--){
        //     if(i*i == num) return true;

        // }
        // return false;
        //binary search approach
        int low = 0;
        int high = num/2;
        if (num == 0 || num == 1) {
            return true;  // 0 and 1 are perfect squares
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            long target =(long) mid*mid;

            if(target == num){
                return true;
            } else if(target > num ){
                 high = mid-1;
                
            }else if(target < num){
               low = mid +1;
            }
        }
        return false;
       
        
    }
}