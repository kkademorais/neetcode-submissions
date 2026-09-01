class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int solution = 0;
        int maxSolution = 0;
        for(int i = 0; i < nums.length; i++){
            solution++;
            if(nums[i] == 0) solution = 0;
            if(solution > maxSolution) maxSolution = solution;
        }
        return maxSolution;
    }   
}