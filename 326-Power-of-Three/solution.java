public class Solution {
    public boolean isPowerOfThree(int n) {
        int i =1;
        if(n<=0)
        return false;
        while(i<Integer.MAX_VALUE&&i<=n){
            if(n == i)
                return true;
            i = i*3;
        }
        return false;
    }
}