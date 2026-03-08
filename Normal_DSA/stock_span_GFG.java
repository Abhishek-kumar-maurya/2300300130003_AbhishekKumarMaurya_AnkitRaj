class Pair{
    int key;
    int value;
    Pair(int key , int value){
        this.key=key;
        this.value=value;
    }
}
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Pair> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length ; i++){
            if(stack.isEmpty()){
                ans.add(i+1);
            }
            else if(!stack.isEmpty() && stack.peek().value >arr[i]){
                ans.add(i-stack.peek().key);
            }
            else if(!stack.isEmpty() && stack.peek().value <= arr[i]){
                while(!stack.isEmpty() && stack.peek().value <=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans.add(i+1);
                }
                else{
                    ans.add(i-stack.peek().key);
                }
            }
            stack.push(new Pair(i,arr[i]));
        }
        return ans;
    }
}