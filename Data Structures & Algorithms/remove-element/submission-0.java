class Solution {

    //Input: nums = [3,2,2,3], val = 3
    //Output: k = 2, nums = [2,2,_,_] 

    //Input: nums = [0,1,2,2,3,0,4,2], val = 2
    //Output: k = 5, nums = [0,1,3,0,4,_,_,_]
    
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else{
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}