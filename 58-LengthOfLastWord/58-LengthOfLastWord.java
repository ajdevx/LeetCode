// Last updated: 15/09/2025, 19:35:29
class Solution {
    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        int count=0;
        int end = temp.length()-1;

        while(end>=0 && temp.charAt(end)!=' ') {
             count++;
             end--;
             }

        return count;
        
    }
}