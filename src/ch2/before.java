package ch2;

import java.time.LocalDate;
import java.time.Period;

public class before {
    private class User {
        // 헝가리식 표기법
        private final String strFirstName;
        private final String strLastName;
        // 발음하기 어려운 이름
        private final LocalDate birthymdhms;
        // 불분명한 의도
        private int m;

        User(String firstName, String lastName, LocalDate birthday) {
            this.strFirstName = firstName;
            this.strLastName = lastName;
            this.birthymdhms = birthday;
            this.m = 0;
        }
        // 의미 있게 구분하지 못함
        User(String s1, String s2, LocalDate d, int m) {
            this.strFirstName = s1;
            this.strLastName = s2;
            this.birthymdhms = d;
            this.m = m;
        }

        // 재미없는 농담
        public void showMeTheMoney() {
            this.m += 10000;
        }

        // 맥락의 일관성 없음
        public void addThousand() {
            this.m += 1000;
        }
        public void plusTenThousand() {
            this.m += 10000;
        }

        // 메소드 이름으로 맞지 않음
        // 상수를 그냥 사용
        public boolean Adult() {
            return Period.between(birthymdhms, LocalDate.now()).getYears() >= 19 ? true : false;
        }
    }
}
