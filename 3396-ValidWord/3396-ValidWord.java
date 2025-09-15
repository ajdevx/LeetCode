// Last updated: 15/09/2025, 19:34:02
class Solution {
    public boolean isValid(String word) {

      int len = word.length();
      if( len<3 ) return false;

      boolean hasVowel = false;
      boolean hasConsonant = false;
    
      char ch = 'a';

      for(int i=0 ; i<len ; i++){
         ch = word.charAt(i);

        if(!Character.isLetterOrDigit(ch) )return false;

        if(Character.isLetter(ch)){
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                hasVowel = true;
            }else{
            hasConsonant = true;
        }
        }
      }
      return (hasVowel && hasConsonant); 
    }
}