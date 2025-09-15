// Last updated: 15/09/2025, 19:35:38
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];// storing first element
        String str2 = strs[strs.length-1]; // stroing second element
        String res = "";
        
        for(int i=0; i<=str1.length()-1 ; i++){
            if(str1.charAt(i)==str2.charAt(i)){
                res+=str1.charAt(i);
            }
            else break;
        }
        return res;
}
}