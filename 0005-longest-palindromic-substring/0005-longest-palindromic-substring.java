class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String l="";

        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);
                if(pali(str) && str.length() > l.length()){
                    l=str;
                }
            }
        }
        return l;
    }

    public boolean pali(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}