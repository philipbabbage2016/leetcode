public class Solution {
    public int singleNumber(int[] nums) {
        int i =0,len = nums.length,t=0,xorRes=0;
        for(;i<len;i++){
            xorRes ^=nums[i];
        }

        return xorRes;
    }
    
}