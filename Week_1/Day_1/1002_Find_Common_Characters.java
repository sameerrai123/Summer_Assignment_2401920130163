import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        int[] minFreq = new int[26];
        for (char ch : words[0].toCharArray()) {
            minFreq[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] freq = new int[26];

            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }

       
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }
}