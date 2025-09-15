// Last updated: 15/09/2025, 19:35:46
class Solution {

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int imax = 0;
        HashSet<Character> hs = new HashSet<>();
        while(end <= s.length()-1){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
                imax =  Math.max(imax, hs.size());
            }
            else{
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return imax;
    }
}
