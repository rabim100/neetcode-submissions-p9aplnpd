class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> resList = new ArrayList<>();
        Map<String, List<String>> res = new HashMap<>();
        //char a = 'a';

        for (String s: strs){
            int[] count = new int[26];
            //char[] c = s.toCharArray();
            for (char c: s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        resList.addAll(res.values());

        return resList; 
    }
}
