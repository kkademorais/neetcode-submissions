class NumArray {

    private int[] sumArr;

    public NumArray(int[] nums) {
        this.sumArr = new int[nums.length];
        this.sumArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++) this.sumArr[i] = this.sumArr[i-1] + nums[i];
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return sumArr[right];
        return sumArr[right] - sumArr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */