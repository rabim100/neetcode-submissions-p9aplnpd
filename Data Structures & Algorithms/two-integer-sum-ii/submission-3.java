class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;
      
        while(right > left){
            int sum = 0;
            sum = numbers[right] + numbers[left];

            if(sum > target){
                right--;
            } else if(sum < target){
                left++;
            } else{
                return new int[]{left + 1, right + 1};
            }
            
        }

      return new int[0];
    }
}
