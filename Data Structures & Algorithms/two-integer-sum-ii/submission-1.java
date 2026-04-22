class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;
        int[] out = new int[2];
        int sum = 0;
      
        while(right > left){
            // if(numbers[right] > target){
            //     right--;
            //     continue;
            // }

            while(right > left){
                sum = numbers[left] + numbers[right];
                if(sum != target){
                    left++;
                } else{
                    out[0] = left + 1;
                    out[1] = right + 1;
                    break;
                }

            }
            right--;
            left = 0;
            
        }

      return out;

    }
}
