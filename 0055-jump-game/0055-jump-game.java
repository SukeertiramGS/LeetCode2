class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0] == 0)return false;

        int n = nums.length;
        int maxReach =nums[0];
        for(int i=1;i<n;i++){
            if(i>maxReach)
            return false;
            else maxReach = Math.max(maxReach, nums[i] + i);
        }
        return true;
    }
}