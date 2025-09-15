// Last updated: 15/09/2025, 19:35:05
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map <Character,Integer> freq = new HashMap<>();
        for(char el: s.toCharArray()){
            if(!freq.containsKey(el)) freq.put(el,1);
            else freq.put(el,freq.get(el)+1);
        }
        for(char el : t.toCharArray()){
            if(!freq.containsKey(el)) return false;
            else if (freq.get(el)==0) return false;
            else freq.put(el,freq.get(el)-1);
        }
        return true;
    }
}