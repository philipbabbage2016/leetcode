public class Solution {
    public int singleNumber(int[] nums) {
        int i =0,len = nums.length,t=0,xorRes=0;
        for(;i<len;i++){
            xorRes ^=nums[i];
        }
        for(i=0;i<len;i++){
            t = xorRes^nums[i];
            if(t==0)
                return nums[i]; 
        }
        return 0;
    }
    
}