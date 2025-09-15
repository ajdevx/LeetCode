// Last updated: 15/09/2025, 19:34:53
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if (n == 1) return false;
        for(int i=n/2 ; i>=1 ; i--){
            if( n%i==0 ){
                int times = n/i;
                String sub = s.substring(0,i);
                String temp = "";
                for(int j=0 ; j<times ; j++){
                    temp += sub;
                }
                if(s.equals(temp)) return true;
            }
        }
        return false;
    }
}