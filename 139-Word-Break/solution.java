public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s== null||wordDict == null||s.length()==0 || wordDict.size() ==0)
            return false;
        for(String t:wordDict){
            if(s.equals(t))
                return true;
            else if(!s.startsWith(t))
                continue;
            else {
                boolean b1 = wordBreak(s.substring(t.length()),wordDict);
                if(b1)
                    return b1;
                wordDict.remove(t);
                return  wordBreak(s,wordDict)  ;
            }
            
        }
        return false;
    }

}