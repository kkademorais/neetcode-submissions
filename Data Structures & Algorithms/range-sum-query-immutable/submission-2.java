class NumArray {

    private ArrayList<Integer> arr;

    public NumArray(int[] nums) {
        this.arr = new ArrayList<>();
        for(int value: nums){
            arr.add(value);
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        while(left <= right){
            if(left == right) sum += this.arr.get(left);
            else{
                int leftValue = this.arr.get(left);
                int rightValue = this.arr.get(right);
                sum += (leftValue + rightValue);
            }
            
            left++;
            right--;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */