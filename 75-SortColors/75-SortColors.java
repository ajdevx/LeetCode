// Last updated: 15/09/2025, 19:35:26
class Solution {
    void swap(int[] arr, int a, int b){
    int temp =arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
    }
    public void sortColors(int[] arr) {
        int low=0;
        int mid=0;
        int high=(arr.length)-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr,high,mid);
                high--;
            }
        }
    }
}