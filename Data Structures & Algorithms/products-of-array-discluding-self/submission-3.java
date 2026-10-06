class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int prefix = 1;
        arr[0] = prefix;
        for(int i = 1; i < nums.length; i++){
            prefix *= nums[i-1];
            arr[i] = prefix;
        }

        int postfix = 1;
        for(int i = nums.length-1; i >= 0; i--){
            arr[i] *= postfix;
            postfix *= nums[i];
        }

        return arr;

    }
}  
