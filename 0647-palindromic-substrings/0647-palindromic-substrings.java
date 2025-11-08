class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    String str=s.substring(i,j+1);
                    if(isPalindrome(str))count++;
                }
            }
            return count;
    }

    public boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }

        return true;
    }
}