class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
          	int left=0;
            long sum=0;
            long maxSum=0;


            Map<Integer,Integer>map=new HashMap();
            for(int right=0; right<nums.length; right++){ 
                
                sum+=nums[right]; //  calculating current sum 
                map.put(nums[right],
                        map.getOrDefault(nums[right],0)+1);  // calculating a 

                if(right - left+1 > k){  
                    int remove= nums[left];  // removing left element when indo is full
                    sum-=remove;             // subtracting a last element from sum 

                    map.put(remove,map.get(remove)-1);  // adding a removed elemnt with subtracting a 1 
                    if(map.get(remove) == 0){   
                    map.remove(remove);         // if the value is 0 then entire key value will remove 
                    }
                    left++; 
                }

                if( (right-left+1 == k)   && map.size() == k){
                    maxSum=Math.max(sum,maxSum); // calculating a maxsum 
                }
            }

            return maxSum;
    }
}