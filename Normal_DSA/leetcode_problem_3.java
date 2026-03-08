class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0 ,max_length=0,same=0;
        int n = s.length();
        if (n==0)return 0;
        for(int a = 0; a<n ; a++){
            if(s.charAt(a)==s.charAt(j)){
                same+=1;
            }
            
            }
        if(same==s.length())return 1;
        while(i<=j && j<n){
            
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j)); 
                max_length=Math.max(j-i+1,max_length);
                j++;
            }
            else if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
                
                }
                
        }    
        return max_length;
    }
}