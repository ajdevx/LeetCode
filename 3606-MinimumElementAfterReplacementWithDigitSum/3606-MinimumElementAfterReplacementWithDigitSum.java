// Last updated: 15/09/2025, 19:33:58
class Solution {
    public int minElement(int[] arr) {
        int min=Integer.MAX_VALUE;
        int el=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            el = arr[i];
            sum=0;
            while(el!=0){
                sum+=el%10;
                el=el/10;
            }
            if(sum<min) min=sum;
            arr[i]=sum; 
        } return min;
    }
}