class Solution {
    public boolean wordPattern(String pattern, String s) {
     Map<Character,String> map=new HashMap<>();
    Map<String,Character> m2=new HashMap<>();
    String str[]=s.split(" ");

    if(pattern.length() != str.length){
        return false;
    }



    for(int i=0; i<str.length; i++){
        char ch=pattern.charAt(i);
        String st=str[i];
        if(map.containsKey(ch)){
            if(!map.get(ch).equals(st)){
                return false;
            }
        }else{
            map.put(ch,str[i]);
        }

        if(m2.containsKey(st)){
            if(!m2.get(st).equals(ch)){
                return false;
            }
        }else{
            m2.put(st,ch);
        }
        
    }


    return true;
    }
}