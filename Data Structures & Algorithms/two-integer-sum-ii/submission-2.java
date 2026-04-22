class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;
        int[] out = new int[2];
        int sum = 0;
      
        while(right > left){

            sum = numbers[right] + numbers[left];

            if(sum > target){
                right--;
                continue;
            } else if(sum < target){
                left++;
                continue;
            } else{
                out[0] = left + 1;
                out[1] = right + 1;
                break;
            }
            
        }

      return out;
    }
}
