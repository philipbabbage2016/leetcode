public class Solution {
    public String reverseVowels(String s) {
        int len = 0;
        if(s == null || (len = s.length()) == 0)
            return s;
        char[]  chars = s.toCharArray();
        int i=0, j= len-1 ;
        char tmp ='a',l=chars[i],r=chars[j];
        while(i<j){
            
            while(l!='a'&&l!='e'&&l!='i'&&l!='o'&&l!='u'){
                i++;
                l = Character.toLowerCase(chars[i]);
            }
            while(r!='a'&&r!='e'&&r!='i'&&r!='o'&&r!='u'){
                j--;
                r = Character.toLowerCase(chars[j]);
            }
            if(i<j){
                tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}