// Last updated: 15/09/2025, 19:34:22
class Solution {
    public int[] sumZero(int n) {
        int []res = new int[n];
        int index = 0;

        for(int i =1 ;i<=n/2; i++){
            res[index] = i;
            index++;
            res[index]= -i;
            index++;
        }
        if(n%2!=0) res[index] = 0;
        return res;
    }
}