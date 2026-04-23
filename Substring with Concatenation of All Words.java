import java.util.*;

public class SubstringWithConcatenation {

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        // Frequency map of words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Try different starting offsets
        for (int i = 0; i < wordLen; i++) {

            int left = i;
            int count = 0;
            Map<String, Integer> windowMap = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (wordMap.containsKey(word)) {

                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    count++;

                    // If word frequency exceeds, shrink window
                    while (windowMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    // Valid window found
                    if (count == wordCount) {
                        result.add(left);
                    }

                } else {
                    // Reset window
                    windowMap.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSubstring("barfoothefoobarman", new String[]{"foo", "bar"})); // [0, 9]
        System.out.println(findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"})); // [6, 9, 12]
    }
}
