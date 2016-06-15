public class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0,absn=0 ;
        if(n<=0)
            return false;
        while(i<32){
            if( n == (1<<i) )
                return true;
            i++;
        }
        return false;
    }
    
    
}