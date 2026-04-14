class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++ ){
                System.out.println(nums[i] + " : " + nums[j]);
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
