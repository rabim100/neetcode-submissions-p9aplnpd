class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        List<List<Integer>> helper = new ArrayList<>();
        int[] resp = new int[k];

        for(int num: nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
            helper.add(new ArrayList<>());
        }

        for(Integer key: counter.keySet()){
            Integer mapValue = counter.get(key);
            helper.get(mapValue-1).add(key);
        }

        int index = 0;
        for (int i = helper.size() - 1; i >= 0 || index < k; i--){
            if(helper.get(i).isEmpty()) continue;
            for (Integer frequency: helper.get(i)){
                if(index < k) {
                    resp[index++] = frequency;
                } else {
                    break;
                }
            }
        }
        return resp;
    }
}
