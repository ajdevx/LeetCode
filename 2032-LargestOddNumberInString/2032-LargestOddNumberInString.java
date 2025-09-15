// Last updated: 15/09/2025, 19:34:05
class Solution {
    public String largestOddNumber(String num) {
        String res="";
        int index = -1;
        for(int i = num.length()-1; i>=0; i--){
            if(Character.getNumericValue(num.charAt(i))%2!=0) {
                index = i;
                break;
            }
        }
        if(index == -1) return res;
        else{
            for(int i=0 ; i<= index ; i++) {
                res = res + num.charAt(i);
            }
        }
    return res;
        
    }
}