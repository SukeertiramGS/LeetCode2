class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==0)?-1:1;
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxLength=Math.max(maxLength,len);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}