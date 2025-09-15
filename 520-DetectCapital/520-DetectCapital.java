// Last updated: 15/09/2025, 19:34:50
class Solution {
    public boolean detectCapitalUse(String word) {
        // a base case
       if( word.length()==0 || word.length()==1 ) {
            return true;
       } 

       if(Character.isUpperCase(word.charAt(0))){
            if(Character.isUpperCase(word.charAt(1))){
                for(int i=2;i<word.length();i++){
                    if(Character.isLowerCase(word.charAt(i))) return false;
                }
              }
            else{
                for(int i=2;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i))) return false;
            }
       }
    }

    else{
          for(int i=1;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i))) return false;
    }
}
return true;
    }
}