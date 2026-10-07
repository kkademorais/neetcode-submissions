class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int curSum = 0;
        int diff = 0;
        map.put(0, 1); // empty prefix
        for(int num: nums){
            curSum += num;
            diff = curSum - k;
            res += map.getOrDefault(diff,0);
            map.put(curSum, map.getOrDefault(curSum,0)+1);
        }
        return res;

    }
}