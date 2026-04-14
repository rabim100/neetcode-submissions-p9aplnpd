class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        //List<String> sortedList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            map.putIfAbsent(tempStr, new ArrayList<String>());
            map.get(tempStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
