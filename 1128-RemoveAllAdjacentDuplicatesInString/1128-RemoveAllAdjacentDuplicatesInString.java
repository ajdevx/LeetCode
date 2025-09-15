// Last updated: 15/09/2025, 19:34:30
class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack <>();
        StringBuilder res = new StringBuilder("");
        int n = s.length();
    
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else if(st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            res = res.append(st.pop());
         }
         res.reverse();
         String a = res.toString();
         return a;
    }
}