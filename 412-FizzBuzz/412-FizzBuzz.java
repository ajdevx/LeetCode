// Last updated: 15/09/2025, 19:34:56
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList <String> lt = new ArrayList<>();
        for(int i=1; i<=n ; i++){
            String s = i+"";
            if( i==1){
                lt.add(s);
            }else if(i%3==0 && i%5==0){
                lt.add("FizzBuzz");
            }else if(i%3==0){
                lt.add("Fizz");
            }else if(i%5==0){
                lt.add("Buzz");
            }else{
                lt.add(s);
            }
        }return lt;
    }
}