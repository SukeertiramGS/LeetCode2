class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=nums[0];
        int minsum=nums[0];
        int total=0,cmin=0,cmax=0;

        for(int n:nums){
            cmax=Math.max(n,cmax+n);
            maxsum=Math.max(cmax,maxsum);


            cmin=Math.min(n,cmin+n);
            minsum=Math.min(cmin,minsum);

            total+=n;
        }

        if(maxsum<0)return maxsum;

        return Math.max(maxsum,total-minsum);
    }
}