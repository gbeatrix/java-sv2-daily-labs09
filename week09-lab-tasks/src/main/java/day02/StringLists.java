package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();
        if (words != null && !words.isEmpty()) {
            int minLength = words.get(0).length();
            for (String word : words) {
                if (word.length() < minLength) {
                    result.clear();
                    minLength = word.length();
                }
                if (word.length() == minLength) {
                    result.add(word);
                }
            }
        }
        return result;
    }
}
