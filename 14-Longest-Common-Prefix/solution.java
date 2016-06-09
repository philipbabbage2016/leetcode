public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index =-1,i=0,len=-1,shortestLen = Integer.MAX_VALUE,t=0;
        if( strs == null || ( len = strs.length ) ==0 ) 
            return "";
        for(i =0;i<len;i++){
            t = strs[i].length();
            if(t<shortestLen){
                shortestLen = t;
                index = i;
            }
        }
        String shortest = strs[index],substr = null,tmpStr = null;
        for(i=shortestLen;i>0;i--){
            substr = shortest.substring(0,i);
            for(t = 0; t<len;t++){
                tmpStr = strs[t];
                if(!tmpStr.startsWith(substr))
                    break;
            }
            if(t==len){
                return substr;
            }else{
                continue;
            }    
        }
        return "";
        
    }
}