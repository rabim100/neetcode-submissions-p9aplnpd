class Solution {
    public int longestConsecutive(int[] nums) {
        Set sortedSet = new HashSet<>();
        List<Integer> numsList = new ArrayList<>();
        int counter = 1;
        int resp = 1;

        Arrays.sort(nums);
        
        for(int i = 0; i <= nums.length - 1; i++){
            if(sortedSet.add(nums[i])){
                numsList.add(nums[i]);
            }
        }

        
        if(numsList.size() == 0) return 0;
        if(numsList.size() == 1) return 1;

        for(int i = 0; i < numsList.size() - 1; i++){
            boolean resta = (numsList.get(i+1) - numsList.get(i)) == 1;

            if(resta){
                counter++; 
            } else{
                counter = 1;
            }

            resp = Math.max(resp, counter);
        }
        System.out.println(numsList);
        return resp;
    }
    
}
