class Solution {
    public int trap(int[] height) {

        
       int leftmax[]=new int[height.length];
       int rightmax[]=new int[height.length];

       int lmax=height[0];
    
       for(int i=0; i<height.length; i++){
        if(height[i]>lmax){ 
            lmax=height[i];
            leftmax[i]=lmax;      
        }else{
            leftmax[i]=lmax;
          }
        }

        int rmax=height[height.length-1]; //  1
        for(int i=height.length-1; i>=0; i--){

            if(height[i] > rmax ){ // 
                rmax=height[i];
                rightmax[i]=rmax;
            }else{
                rightmax[i]=rmax;
            }
        }

        int current=0;
        int tb=0;
        for(int i=0; i<height.length; i++){

            if(leftmax[i]<rightmax[i]){
                current=leftmax[i];
            }else{
               current=rightmax[i];
            }

             if(current > height[i]){
                    tb += current - height[i];
                 }
     
        }

        return tb;



    }
}