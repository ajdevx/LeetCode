// Last updated: 15/09/2025, 19:34:59
class Solution {
    public void reverseString(char[] s) {
    int left = 0;
    int right = s.length-1;
    char temp = 'a';
    while(left<right){
        temp = s[left];
        s[left] = s[right];
        s[right]= temp;
        left++;
        right--;
    }   
    }
}