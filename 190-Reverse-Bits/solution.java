public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i =0,l,r,lo,ro;
        while(i<16){
            l = n&(1<<(31-i));
            r = n&(1<<i);
            lo = l>>(31-i);
            ro = r>>i;
            if(lo == ro)
                continue;
            if(lo ==1){
                n =  n - l;
                n =  n + (1<<i);
            }else{
                n = n - r;
                n = n + (1<<(31-i));
            }
            i++;
            return n;
        }
        
        
    }

}