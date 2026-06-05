class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer>s=new HashSet<>();
        for(int i=0; i<nums.length;i++){
                s.add(nums[i]);
        }

         
         
         int longestCons=0;
         int currentNum=0;
        for(int num:s){
            
                if(!s.contains(num-1)){
                        int Cons=1;
                        currentNum=num;
                        while(s.contains(currentNum+1)){
                                currentNum++;
                                Cons++;
                        }  
                    if(Cons>longestCons){
                    longestCons=Cons;
                }
            }
               
        }


        return longestCons;

    }
}