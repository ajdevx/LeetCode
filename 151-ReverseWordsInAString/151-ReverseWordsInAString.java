// Last updated: 15/09/2025, 19:35:17
class Solution {
    public String reverseWords(String s) {
       int  n = s.length();
       int i = 0;
       int j = 0;
       String w="";
       String res="";
       while(i<n){

          while(i < n && s.charAt(i)==' ') i++;
          if(i>=n) break;// all are space

          j = i;

          while(j < n && s.charAt(j)!=' ') j++;

          w = s.substring(i,j);

          if(res.isEmpty()) res = w; 

          else res = w+" "+res; 

          i=j;

       } 
       return res;
    }
}