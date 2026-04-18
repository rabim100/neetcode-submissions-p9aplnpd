class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while( left <= right){
            if(!isAlphaNumeric(s.charAt(left))){
                left++;
            } else if(!isAlphaNumeric(s.charAt(right))){
                right--;
            }
            else{
                if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase((s.charAt(right)))){
                    left++;
                    right--;
                } else{
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isAlphaNumeric(char c){
        return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || ('0' <= c && c <= '9');
    }
}
