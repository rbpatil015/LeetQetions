class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
                return 0;
        }

            int jump=0;
            int current=0;
            int last=0;

            for(int i=0; i<nums.length-1; i++){
                
             if(i+nums[i] > current){
                    current=i+nums[i];
             }

             if(i == last){
                    jump++;
                    last=current;
             }
        }

            return jump;
    }
}