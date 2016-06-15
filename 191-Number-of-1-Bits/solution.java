public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i =0,cnt=0 ,t=0;
        while(i<32){
            t = 1<<i;
            if((n&(t)) == t)
                cnt++;
            i++;
        }
        return cnt;
    }
}