package ch2;

import java.time.LocalDate;
import java.time.Period;

public class after {
    private class User {
        // 상수에 이름을 붙여 성인연령 기준이 변경되도 이 필드만 바꾸면 됨
        private static final int MINIMUM_ADULT_AGE = 19;
        private final String firstName;
        private final String lastName;
        private final LocalDate birthDate;
        private int money;

        private User(String firstName, String lastName, LocalDate birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.money = 0;
        }
        private User(String firstName, String lastName, LocalDate birthDate, int money) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.money = money;
        }

        public boolean isAdult() {
            return Period.between(birthDate, LocalDate.now()).getYears() >= MINIMUM_ADULT_AGE ? true : false;
        }
    }
}
