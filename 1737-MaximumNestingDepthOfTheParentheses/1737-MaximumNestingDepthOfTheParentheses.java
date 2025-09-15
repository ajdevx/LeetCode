// Last updated: 15/09/2025, 19:34:11
class Solution {
    public int maxDepth(String s) {
        Stack <Character> sc = new Stack<>();
        int count = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                max = Math.max(count,max);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            else ;
        }
        return max;
    }
}