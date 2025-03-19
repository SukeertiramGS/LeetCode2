class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length()+word2.length();
        String c=new String("");
        for(int i=0;i<n;i++){
            if(i<word1.length())
            c+=word1.charAt(i);
            if(i<word2.length())
            c+=word2.charAt(i);
        


        }
        return c;
    }
}