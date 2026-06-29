class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int a=1;
        int lastIndex=0;
for(int i=citations.length-1; i>=0; i--){
    if(citations[i]>=a){
        lastIndex=a;
    }else{
        break;
    }
    a++;
}
    return lastIndex;
                

    }
}