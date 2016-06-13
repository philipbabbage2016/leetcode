public class Solution {
    public int singleNumber(int[] nums) {
        int sum =0,pos=0,res=0,len= nums.length;
        for(int i =0;i<32;i++){
            pos = 1<<i;
            sum=0;
            for(int j =0;j<len;j++){
                if( (pos & nums[j] ) == pos ){
                    sum++;
                }
            }
            if((sum%3) ==1){
                res = (res|pos);
            }
        }
        return res;
    }
}