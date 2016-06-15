public class Solution {
    public boolean isPowerOfThree(int n) {
        int i=3;
        if(n<=0)
            return false;
        if(n ==1||n==3)
            return true;
        while(i<Integer.MAX_VALUE&&i<=n){
            if((n%i) !=0)
                return false;
            n=n/i;
            if(n ==3|| n== 1 || i==n || i=3*n){
                return true;
            } 
            i=i*3;
            
        }
        i=3;
        return false;
    }
}