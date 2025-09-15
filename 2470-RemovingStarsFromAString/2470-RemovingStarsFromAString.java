// Last updated: 15/09/2025, 19:33:59
class Solution {
    public String removeStars(String s) {
       Stack<Character> st = new Stack<>();

       for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(st.isEmpty()) continue;
                st.pop();
            }else{
                st.push(ch);
            }
       }

       StringBuilder br = new StringBuilder();
       while(!st.isEmpty()){
        br.append(st.pop());
       }
       br.reverse();
        String res = br.toString();
         return res;
    }
}