// Last updated: 15/09/2025, 19:35:02
class Solution {
    public void moveZeroes(int[] arr) {
       int fix = 0;
       int rev = 0;
       int n =  arr.length-1;
       while(fix<= n && rev<= n){
            if(arr[fix]!=0){
            fix++;
            rev++;
        }
            else if(arr[rev]==0 && rev<=n) rev++;
            else if(arr[rev]!=0 && rev<=n){
                int temp = arr[fix];
                arr[fix] = arr[rev];
                arr[rev] = temp;
                fix++;
                rev++;
                // rev = fix;
            }
       }
    }
}