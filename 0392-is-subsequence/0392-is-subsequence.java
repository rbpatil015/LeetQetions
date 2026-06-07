class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){return true; }
         boolean check[]=new boolean[s.length()];
         int a=0;
         for(int i=0; i<t.length();i++){
                if( (a < check.length) && (s.charAt(a) == t.charAt(i))){
                       check[a]=true;
                       a++;
                }
         }

         for(int i=0 ; i<check.length;i++){
                if(!check[i]){
                    return false;
                }
         }

         return true;
    }
}