public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0)
            return false;
        int i=0;
        while(i<32){
            if(num == (1<<i))
                return true;
            i+=2;
        }
        return false;
    }
}