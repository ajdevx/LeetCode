// Last updated: 15/09/2025, 19:35:44
class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0 ;
        int maxlen = 0;
        String res = "";
        // base case 
        if(s.length()==1) {
           return s;
        }
        // initilize rsult to first char in case no palindrom
        res = s.substring(0,1);

    // handel odd length case 
    
    for(int i =0 ; i<s.length();i++){
        left = i-1;
        right = i+1;
        while(left>=0 && right<s.length()){ // expanding outward to check for palindrom
            
            if(s.charAt(left) == s.charAt(right)){
                if(maxlen< right - left + 1){
                     res = s.substring(left, right + 1);
                     maxlen = right - left + 1;
                }
                 right++;
                 left--;
               } else{
                break;
               }
              
        }
    }
    
    // handel even length case
  
        for(int i=0; i<s.length();i++){
            left =i;
            right =i+1;
            while(left>=0 && right<s.length()){
                if(s.charAt(left) == s.charAt(right)){
                     if(maxlen < right - left + 1){
                     res = s.substring(left, right + 1);
                     maxlen = right - left + 1;
                }
                right++;
                left--;
                }else{
                    break;
                }
            }
        }
    
      return res;  
    }

}