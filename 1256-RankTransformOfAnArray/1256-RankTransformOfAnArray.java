// Last updated: 15/09/2025, 19:34:26
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int temp[] = arr.clone();
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        int rank =1;
        for(int i=0;i<n;i++){
            if(hs.containsKey(temp[i])){
                continue;
            }
            else{
                hs.put(temp[i],rank++);
            }
        }
        
        for(int i=0 ; i<n ; i++){
            arr[i] = hs.get(arr[i]);
        }
        return arr;
    }
}