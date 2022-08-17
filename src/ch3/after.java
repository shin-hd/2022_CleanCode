package ch3;

import java.util.ArrayList;
import java.util.List;

public class after {
    List<String> words = new ArrayList<>();

    public void print() {
        words.forEach(word -> System.out.println(word));
    }

    // 단어가 기존 리스트에 있는지 확인
    // after.hasWord(word);
    public boolean hasWord(String word) {
        return words.stream().anyMatch(w -> w.equalsIgnoreCase(word));
    }

    // 단어 추가만
    public void addWord(String word) {
        if (!hasWord(word))
            words.add(word.toLowerCase());
    }

    // 가변인자 사용
    public void addWords(String... words) {
        for (String word : words) {
            addWord(word);
        }
    }

}