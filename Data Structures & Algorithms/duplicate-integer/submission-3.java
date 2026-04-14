class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> numsSet = new HashSet<>();
        
        for(int num: nums){
            if(!numsSet.add(num)){
                return true;
            }
        }
        return false;
    }
}
