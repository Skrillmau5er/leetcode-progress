class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<String, Integer> magazineChars = new HashMap<String, Integer>();

        for(int i = 0; i < magazine.length(); i++) {
            String c = Character.toString(magazine.charAt(i));
            if(magazineChars.containsKey(c)) {
                magazineChars.put(c, magazineChars.get(c) + 1);
            } else {
                magazineChars.put(c, 1);
            }
        }


        for(int i = 0; i < ransomNote.length(); i++) {
            String c = Character.toString(ransomNote.charAt(i));
            if(magazineChars.containsKey(c) && magazineChars.get(c) > 0) {
                magazineChars.put(c, magazineChars.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}