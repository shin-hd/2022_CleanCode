package ch3;

import java.util.ArrayList;
import java.util.List;

public class before {
    List<String> words = new ArrayList<>();

    public void print() {
        words.forEach(word -> System.out.println(word));
    }

    // 한번에 여러가지 수행
    // 추상화 수준이 일정하지 않음
    // 명령과 조회가 동시에
    // 중복
    public boolean addWordAndPrint(String word) {
        if (words.stream().anyMatch(w -> w.equalsIgnoreCase(word))) {
            words.add(word.toLowerCase());
            print();
            return true;
        }
        else {
            print();
            return false;
        }
    }

    // 많고 동일한 타입의 옵셔널 매개변수
    // 중복
    public void words(String w1, String w2, String w3) {
        if (!"".equals(w1))
            if (words.stream().anyMatch(w -> w.equalsIgnoreCase(w1)))
                words.add(w1.toLowerCase());

        if (!"".equals(w2))
            if (words.stream().anyMatch(w -> w.equalsIgnoreCase(w2)))
                words.add(w2.toLowerCase());

        if (!"".equals(w3))
            if (words.stream().anyMatch(w -> w.equalsIgnoreCase(w3)))
                words.add(w3.toLowerCase());
    }
}