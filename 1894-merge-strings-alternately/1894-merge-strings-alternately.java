class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length()+word2.length();
        String c=new String("");
        int j=0;
        for(int i=0;i<n;i++){
            if(j<word1.length())
            c+=word1.charAt(j);
            if(j<word2.length())
            c+=word2.charAt(j);
            j++;


        }
        return c;
    }
}