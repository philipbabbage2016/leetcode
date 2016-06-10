public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        int i =0, len = nums.length,tk=0,tv=0;
        for(;i<len;i++){
            tk= nums[i];
           
            if(!numMap.containsKey(tk)){
                numMap.put(tk,1);
            }else{
                tv = numMap.get(tk);
                numMap.put(tk,tv+1);
            }
        }
        for(int k :numMap.keySet()){
            if(numMap.get(k) ==1)
            return k;
        }
        return -1;
    }
}