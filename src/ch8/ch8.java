package ch8;

/*
 * ch8. 경계
 * 소프트웨어 경계를 깔끔하게 처리하는 기법과 기교
 *
 * # 외부 코드 사용하기
 * 패키지, 프레임워크 제공자는 적용성을 넓히려 애씀
 * 사용자는 요구에 집중하는 인터페이스 원함
 *
 * 경계 인터페이스를 사용해서 외부 API를 내부에 숨김
 * - 외부 API 의존성 감소
 * - 규칙을 따르도록 강제
 * - 사용성 증가
 *
 * # 경계 살피고 익히기
 * 간단한 테스트 케이스를 작성해 외부 코드 익히기 : 학습 테스트
 * API를 사용하는 목적에 초점
 * 통제된 환경에서 API를 제대로 이해하는지 확인
 *
 *
 * # log4j 익히기
 *
 * # 학습 테스트는 공짜 이상이다
 * 학습 테스트 비용 << 이해도 상승, 호환성 검증
 * 실제 코드와 동일한 방식으로 인터페이스를 사용하는 테스트 케이스가 필요
 *
 * # 아직 존재하지 않는 코드를 사용하기
 * 인터페이스 문서만으로 아직 구현되지 않은 인터페이스를 더미로 만들어 사용하고,
 * ADAPTER 패턴으로 나중에 API 구현이 완료됬을 때 수정할 코드를 한곳에 모아둠
 *
 * # 깨끗한 경계
 * 외부 패키지를 세세히 알 필요 없음
 * 통제가 가능한 우리 코드에 의존해야 함
 * => 외부 API를 wrapping
 *    ADAPTER 패턴 사용
 * 
 */
public class ch8 {
}
