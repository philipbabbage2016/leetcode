public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i =0,l,r;
        while(i<16){
            l = (n>>(31-i))&1;
            r = (n>>i)&1;
            if(l == r);
            else if(l == 1){
                n =  n - (1<<(31-i));
                n =  n + (1<<i);
            }else{
                n = n - (1<<i);
                n = n + (1<<(31-i));
            }
            i++;
        }
        return n;
        
    }

}