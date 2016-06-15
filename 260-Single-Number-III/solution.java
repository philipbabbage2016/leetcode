public class Solution {
    public int[] singleNumber(int[] nums) {
        int xorRes =0 ,pos=0,t =1,a=0;
        for(int i:nums){
            xorRes ^= i;
        }
        pos = getFirst1(xorRes);
        t=(1<<pos);
        for(int i:nums){
            if((i&t) ==0){
                a^=i; 
            }
        }
        int[] res ={a,a^xorRes};
        return res;
        
        
    }
    
    public int getFirst1(int n){
        int i =0;
        while(i<32){
            if(((n>>i)&1) ==1)
                return i;
            i++;
        }
        return i;
    }
}