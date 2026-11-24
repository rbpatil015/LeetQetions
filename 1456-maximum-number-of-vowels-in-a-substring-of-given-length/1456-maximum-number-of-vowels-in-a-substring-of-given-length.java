class Solution {
    public int maxVowels(String str, int k) {
        	
				StringBuilder s=new StringBuilder();
				int count=0;
				for(int i=0; i<k; i++){
					char ch=str.charAt(i);
					s.append(ch);
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
						ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
						count++;
						}
				}
				int maxVowels=count;
				
				
				for(int i=k; i<str.length(); i++){
					char ch=str.charAt(i);
					s.append(ch);
				
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
						ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
						count++;
					}
					
					char c=str.charAt(i-k);
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
						c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
						count--;
					}
					
					// s.deleteCharAt(i-k);
					
					if(count > maxVowels){
					maxVowels=count;
					}
				}
				
				return maxVowels;
				
    }
}