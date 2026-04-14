class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstWordMap = new HashMap<>();
        Map<Character, Integer> secondWordMap = new HashMap<>();
        char[] firstWord = s.toLowerCase().toCharArray(); 
        char[] secondWord = t.toLowerCase().toCharArray();
        int wordLength = firstWord.length;

        if(firstWord.length != secondWord.length){
            return false;
        }

        for(int i = 0; i < wordLength; i++){
            if(!firstWordMap.containsKey(firstWord[i])){
                firstWordMap.put(firstWord[i], 1);
            }
            else {
                firstWordMap.put(firstWord[i], firstWordMap.get(firstWord[i]) + 1);
            }

            if(!secondWordMap.containsKey(secondWord[i])){
                secondWordMap.put(secondWord[i], 1);
            }
            else {
                secondWordMap.put(secondWord[i], secondWordMap.get(secondWord[i]) + 1);
            }
        }

        if(firstWordMap.equals(secondWordMap)){
            return true;
        }
        else {

        return false;
        }

    }
}
