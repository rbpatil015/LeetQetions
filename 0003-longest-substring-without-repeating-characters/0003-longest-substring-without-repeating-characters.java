class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> window=new HashSet<>();
        int right=0, left=0 , maxlen=0; 

        while(right < s.length()){
            if(!window.contains(s.charAt(right))){
                window.add(s.charAt(right));
                maxlen=Math.max(maxlen , right - left + 1);
                right++;
            }else{
               window.remove(s.charAt(left));
               left++; 
            }
        }
     return maxlen;   
    }
}