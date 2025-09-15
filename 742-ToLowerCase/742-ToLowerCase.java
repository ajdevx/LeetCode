// Last updated: 15/09/2025, 19:34:40
class Solution {
    public String toLowerCase(String s) {
        String res = "";
    for (int i=0; i<s.length();i++){
        char ch = s.charAt(i);
       if(ch>='A'&& ch<='Z'){
            res += (char) ((s.charAt(i)+32));
       }
       else res+= s.charAt(i);
    } return res; 
    }
}