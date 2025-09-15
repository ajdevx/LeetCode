// Last updated: 15/09/2025, 19:34:42
class Solution {
    public int calPoints(String[] arr) {
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    for(int i=0 ;i <n ; i++){
        int num =0;
        String ch = arr[i];
        if(!ch.equals("C") && !ch.equals("D") && !ch.equals("+")){
            num = Integer.parseInt(ch);
            st.push(num);//all integer will be inserted
        }else if(ch.equals("C")){
            st.pop();
        }else if(ch.equals("D")){
            st.push(st.peek()*2);
        }else{
            int temp = st.pop();
            int sum = st.peek()+temp;
            st.push(temp);
            st.push(sum);
        }
        
        
    }
    int sum = 0;
    while(!st.isEmpty()){
        sum = sum + st.pop();
    }
    return sum;
    }
}