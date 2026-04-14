class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiplicationRes = 0;
        int[] resArray = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i]; 
            nums[i] = nums[0]; 
            nums[0] = temp; 
            multiplicationRes = 1;
            for (int j = 1; j < nums.length; j++){
                multiplicationRes *= nums[j];
            }
            resArray[i] = multiplicationRes;
            nums[0] = nums[i];
            nums[i] = temp;
        }
        return resArray;
    }
}  
