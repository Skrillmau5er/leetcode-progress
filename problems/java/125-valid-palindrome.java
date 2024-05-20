class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        String alphaNumString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int p1 = 0;
        int p2 = alphaNumString.length() - 1;

        while(p1 < p2) {
            if(alphaNumString.charAt(p1) != alphaNumString.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}