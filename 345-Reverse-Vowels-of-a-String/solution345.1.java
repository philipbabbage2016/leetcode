public class Solution {
    public String reverseVowels(String s) {
        int len = 0;
        if(s == null || (len = s.length()) == 0)
            return s;
        char[]  chars = s.toCharArray();
        int i =0,j=0,size =0;
        char t = 'a';
        for (i =0;i<len;i++){
            t =  Character.toLowerCase(chars[i]);
            if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
                size++;
        }
        
        int[] indexes = new int[size];
        char[] vowels = new char[size]; 
        
        for ( i =0,j=0;i<len;i++){
            t =  Character.toLowerCase(chars[i]);
            if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u'){
                indexes[j] = i;
                vowels[j] = chars[i];
                j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] reversedVowels = sb.append(vowels).reverse().toString().toCharArray();
        
        for (i =0;i<size;i++){
            chars[indexes[i]] = reversedVowels[i];
        }
        
        return new String(chars);
    }
}