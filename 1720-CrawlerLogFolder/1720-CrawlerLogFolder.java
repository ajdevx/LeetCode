// Last updated: 15/09/2025, 19:34:14
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        int n = logs.length;
        for(int i=0; i<n ; i++){
            if(logs[i].equals("../")){
                if(!st.isEmpty()) st.pop();
            }else if(logs[i].equals("./")) {
                continue;
            }else{
                st.push(logs[i]);
            }
        }

        //counting numbers of element
        int count = 0;
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
        return count;
    }
}