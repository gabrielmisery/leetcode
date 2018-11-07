import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution30 {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word", "good", "best", "word"};
        System.out.println(findSubstring(s, words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (words.length == 0 || s.isEmpty())
            return list;
        int totalLength = words[0].length() * words.length;
        for (int i = 0; i < s.length() - totalLength + 1; i++) {
            String tempS = s.substring(i, i + totalLength);
            if (isTrue(tempS, words))
                list.add(i);
        }

        return list;
    }

    public static boolean isTrue(String tempS, String[] words) {
        int start = 0;
        int len = words[0].length();
        List<String> tempWords = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            tempWords.add(tempS.substring(start, start + len));
            start += len;
            i++;
        }
        for (String word : words) {
            if (!tempWords.contains(word))
                return false;
            tempWords.remove(word);
        }
        return true;
    }
}
