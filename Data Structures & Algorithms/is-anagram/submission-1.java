class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstWordMap = new HashMap<>();
        Map<Character, Integer> secondWordMap = new HashMap<>();
        // char[] firstWord = s.toLowerCase().toCharArray(); 
        // char[] secondWord = t.toLowerCase().toCharArray();
        int firstWordLength = s.length();
        int secondWordLength = t.length();

        if(firstWordLength != secondWordLength){
            return false;
        }

        for(int i = 0; i < firstWordLength; i++){
            // if(!firstWordMap.containsKey(firstWord[i])){
            //     firstWordMap.put(firstWord[i], 1);
            // }
            // else {
            //     firstWordMap.put(firstWord[i], firstWordMap.get(firstWord[i]) + 1);
            // }

            // if(!secondWordMap.containsKey(secondWord[i])){
            //     secondWordMap.put(secondWord[i], 1);
            // }
            // else {
            //     secondWordMap.put(secondWord[i], secondWordMap.get(secondWord[i]) + 1);
            // }

            firstWordMap.put(s.charAt(i), firstWordMap.getOrDefault(s.charAt(i), 0) + 1);
            secondWordMap.put(t.charAt(i), secondWordMap.getOrDefault(t.charAt(i), 0) + 1);

        }

        // if(firstWordMap.equals(secondWordMap)){
        //     return true;
        // }
        // else {

        // return false;
        // }

        return firstWordMap.equals(secondWordMap);

    }
}
