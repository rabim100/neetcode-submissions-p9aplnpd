class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;

        do{
            j+= 1;
            if(j >= nums.length){
                i++;
                j = i + 1;
            }
        } while(nums[i] + nums[j] != target);

        int[] resp = {i, j};
        return resp;
    }
}
