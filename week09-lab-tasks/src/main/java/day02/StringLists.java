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

    public List<String> shortestWords2(List<String> words) {
        List<String> result = new ArrayList<>(words);
        int i = 0;
        int minLength = Integer.MAX_VALUE;
        while (i < result.size()) {
            if (result.get(i).length() < minLength) {
                minLength = result.get(i).length();
                i = 0;
            } else if (result.get(i).length() > minLength) {
                result.remove(i);
            } else {
                i++;
            }
        }
        return result;
    }
}
