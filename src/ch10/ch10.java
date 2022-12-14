package ch10;

/*
 * ch10. 클래스
 * 깨끗한 클래스
 *
 * # 클래스 체계
 * 변수목록
 *  static public 상수
 *  static private 변수
 *  private 인스턴스 변수
 * 공개 함수
 *  비공개함수는 호출하는 공개함수 직후
 *
 * - 캡슐화
 * 같은 패키지 안에서 테스트 코드가 함수, 변수 사용 => protected, package-private
 * 캡슐화 풀어주는 결정은 최후의 수단
 *
 * # 클래스는 작아야 한다
 * 얼마나?
 * 클래스가 맡은 책임만큼
 * 클래스 이름 : 클래스 책임 기술
 * 클래스 설명에는 if, and, or, but을 사용 x
 *
 * - 단일 책임 원칙, SRP
 * 클래스나 모듈을 번경할 이유가 단 하나 뿐이어야 함
 * 큰 클래스 몇 <<<<<< 작은 클래스 여럿
 *
 * - 응집도
 * 모든 인스턴스 변수를 메소드마다 사용 -> 응집도 최고
 * 응집도 높음 -> 메소드와 변수가 서로 의존하며 묶여있음
 * 응집도가 낮아짐 -> 클래스를 쪼개야
 *
 * - 응집도를 유지하면 작은 클래스 여럿이 나온다
 * 클래스가 응집력 잃음 -> 쪼개
 * 리팩토링 과정에서 코드가 늘어나는 이유
 *  1) 길고 서술적인 변수 이름
 *  2) 주석 추가 수단으로 함수 선언과 클래스 선언 사용
 *  3) 공백 추가 및 형식 맞춤
 *
 * # 변경하기 쉬운 클래스
 * 깨끗한 시스템 : 클래스를 체계적으로 정리 -> 변경 시 위험을 낮춤
 * OCP(Open Closed Principle) : 확장에 개방적, 수정에 폐쇄적
 * 새 기능 추가 : 시스템 확장, 기존 코드 변경 x
 * 
 * - 변경으로부터 격리
 * 상세한 구현에 의존하는 코드는 테스트가 어려움
 * 결합도 최소 -> DIP(Dependency Inversion Principle)을 따르는 클래스
 * 구체적 사실을 모두 숨김(추상화)
 *
 */
public class ch10 {
}
