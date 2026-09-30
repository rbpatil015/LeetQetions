class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);
    List<List<Integer>>list=new LinkedList<>();
    for(int i=0; i<nums.length-2; i++){
        if(i > 0 && nums[i]==nums[i-1]){
            continue;
        }
        int left=i+1;
        int right=nums.length-1;
        int sum=0;
        while(left < right){
            sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer>li=new LinkedList<>();
                    li.add(nums[i]);
                    li.add(nums[left]);
                    li.add(nums[right]);
                    list.add(li);
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right]==nums[right-1]){
                        right--;
                    }
                     // Move to new positions
                    left++;
                    right--;

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
        }
        
    }

    return list;
  }
}