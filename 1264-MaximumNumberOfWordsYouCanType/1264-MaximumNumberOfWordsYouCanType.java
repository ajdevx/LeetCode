// Last updated: 15/09/2025, 19:34:25
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s =  text.split(" ");
        int sn =  s.length;
        int bl = brokenLetters.length();
        int count = sn;

        for(int i=0; i<sn ; i++){
        
            for(int j=0; j<bl ; j++){
                if(s[i].contains(""+brokenLetters.charAt(j))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}