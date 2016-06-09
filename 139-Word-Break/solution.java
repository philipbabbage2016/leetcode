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
                
                Set<String> dict2 = new HashSet<String>(wordDict);
                dict2.remove(t);
                return  wordBreak(s.substring(t.length()),wordDict) || wordBreak(s,dict2)  ;
            }
            
        }
        return false;
    }

}