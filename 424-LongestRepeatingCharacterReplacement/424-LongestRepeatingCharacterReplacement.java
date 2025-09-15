// Last updated: 15/09/2025, 19:34:55
class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character,Integer> mp = new HashMap<>();
    int maxfre=0;
    int left=0;
    int right =0;
    int res=0;

    while(right<s.length()) {
        if(!mp.containsKey(s.charAt(right))) mp.put(s.charAt(right),1);
        else mp.put(s.charAt(right),mp.get(s.charAt(right))+1);

        maxfre = Math.max(maxfre,mp.get(s.charAt(right)));

        if((right-left+1)-maxfre> k){
            mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
            left++;
            }
        res = Math.max(res,right-left+1);
        right++;
    } 
    return res;   
    }
}