class Solution {
    public int[] twoSum(int[] numbers, int target) {

    int currentIndx=0;
    int lastIndx=numbers.length-1;
    while(currentIndx < lastIndx){
        int sum=numbers[currentIndx]+numbers[lastIndx];
        if(sum == target){
            return new int[]{currentIndx+1,lastIndx+1};
        }

        if(sum < target){
            currentIndx++;
        }else{
            lastIndx--;
        }
    }   

    return new int[]{};
       
    }
}