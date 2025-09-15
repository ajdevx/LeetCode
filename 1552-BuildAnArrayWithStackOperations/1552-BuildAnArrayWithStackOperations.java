// Last updated: 15/09/2025, 19:34:19
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ls = new ArrayList<>();

        int inx = 0;
        for(int i=1 ; i<=n ; i++){
            if(inx>=target.length) break;
            if(target[inx] == i){
                ls.add("Push");
                inx++;
            }else{
                ls.add("Push");
                ls.add("Pop");
            }
        }
        return ls;
    }
}