public class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0,absn=0 ;
        absn = n>0?n:~n+1
        while(i<32){
            if( absn == (1<<i) )
                return true;
            i++;
        }
        return false;
    }
    
    
}