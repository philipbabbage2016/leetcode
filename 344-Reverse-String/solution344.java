public class Solution {
    public String reverseString(String s) {
        if(s == null | s.length() == 0)
            return s;
        StringBuilder sb = new StringBuilder();
        return sb.append(s.toCharArray()).reverse().toString();
    }
}