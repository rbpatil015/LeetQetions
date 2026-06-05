class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
int sorted[]=new int[m+n];
        int a=0, b=0;
        for(int i=0; i<sorted.length;i++){
            if( a < m && b < n && (nums1[a]<nums2[b]) ){
                sorted[i]=nums1[a];
                a++;
            }else if( a < m && b < n && (nums2[b]<nums1[a])	){
				sorted[i]=nums2[b];
				b++;
			}else if(a < m){
				sorted[i]=nums1[a];
                a++;
			}
			else{
                sorted[i]=nums2[b];
                b++;
            }
        }

        for(int i=0; i<sorted.length;i++){
            nums1[i]=sorted[i];
            System.out.print(nums1[i]+" ");
        }
    }
}