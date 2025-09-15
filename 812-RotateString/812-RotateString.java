// Last updated: 15/09/2025, 19:34:39
class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length()) return false;

        for(int i=0;i<s.length();i++){
            if((s.substring(i)+s.substring(0,i)).equals(goal)) return true;
        }
        return false;
    }
}