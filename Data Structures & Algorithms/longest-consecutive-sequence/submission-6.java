class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(int num: nums){
            numsSet.add(num);
        }

        int resp = 0;
        
        for(int num: numsSet){

            //Determina inicios de secuencia
            if(!numsSet.contains(num - 1)){
                int length = 1;

                while(numsSet.contains(num + length)) length++;

                resp = Math.max(resp, length);
            }
        }

        return resp;
    }
}
