class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumArr = new int[nums.length];
        sumArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++) sumArr[i] = sumArr[i-1] + nums[i];
    
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum = sumArr[nums.length-1] - leftSum - nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}