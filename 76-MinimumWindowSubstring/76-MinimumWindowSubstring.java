// Last updated: 15/09/2025, 19:35:25
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();

        // putting all values of t in hashmap
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }  
        // Variables for the sliding window
        int left = 0; 
        int minLen = Integer.MAX_VALUE; 
        int matched = 0; 
        String res = "";
     
        // creating a new hash map to store elements of s
        HashMap<Character, Integer> windowCounts = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // if a character is part of t then update windowCount
            if (mp.containsKey(ch)) {
                windowCounts.put(ch, windowCounts.getOrDefault(ch, 0) + 1);

                if (windowCounts.get(ch).equals(mp.get(ch))) {
                    matched++;
                }
            }

            // storing result
            while (matched == mp.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    res = s.substring(left, right + 1);
                }

                // shrinking the window by moving left pointer
                char leftChar = s.charAt(left);
                if (mp.containsKey(leftChar)) {
                    windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                    if (windowCounts.get(leftChar) < mp.get(leftChar)) {
                        matched--;
                    }
                } 
                left++;   
            } 
        } 

        return res.isEmpty() ? "" : res; 
    } 
}
