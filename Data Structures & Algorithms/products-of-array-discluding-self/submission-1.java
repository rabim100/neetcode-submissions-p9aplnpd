class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        int prefix = 1;
        int postfix = 1;

        //Llenando prefijos al array de salida
        for( int i = 0; i < len; i++){
            output[i] = prefix;
            prefix *= nums[i]; 
        }

        //Multiplica los posfijos con los prefijos ya dentro del array de salida.
        for (int i = len - 1; i >= 0; i--){
            output[i] *= postfix;
            postfix *= nums[i]; 
        }

        System.out.println(Arrays.toString(output));

        return output;
    }
}  
