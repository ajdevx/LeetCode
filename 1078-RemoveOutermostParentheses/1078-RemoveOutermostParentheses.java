// Last updated: 15/09/2025, 19:34:32
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String res = "";
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='('){
                if(count>0){ 
                    res = res + ch;
                    }
                count++;

            }else if(ch ==')'){
                count--;
                if(count>0){
                    res = res + ch;
                }
            }
        }return res;
       
    }
}