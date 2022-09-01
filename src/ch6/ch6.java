package ch6;

import java.awt.*;
import java.rmi.NoSuchObjectException;

/*
 * ch6. 객체와 자료구조
 *
 * # 자료 추상화
 * 변수를 private으로 선언하더라도 getter, setter 제공하면 결국 구현을 노출하는 셈
 * 함수 계층을 거친다고 해서 구현이 감춰지는 것은 아님. 추상화가 필요
 * 추상 인터페이스를 제공해서 사용자가 구현을 모르고 사용하도록
 * 세세한 자료 x
 * 추상적 개념 o
 * 
 * # 자료/객체 비대칭
 * 객체 : 추상화 뒤에 자료를 숨긴 채 함수만 공개
 * 자료구조 : 자료를 그대로 공개, 함수는 제공 x
 * 
 *               자료구조    |   객체
 * 함수 추가   | 바로 추가     | 클래스 전체 수정
 * 클래스 추가 | 함수 전체 수정 | 바로 추가
 *
 * 새로운 타입 추가 -> 클래스와 객체 지향
 * 새로운 함수 추가 -> 절차적 코드와 자료구조
 *
 * # 디미터 법칙
 * 모듈은 자신이 조작하는 객체의 속사정을 몰라야 한다는 법칙
 * 클래스 C의 메소드 f는 다음 객체의 메소드만 호출해야 함
 * - 클래스 C
 * - f가 생성한 객체
 * - f 인수로 넘어온 객체
 * - C 인스턴스 변수에 저장된 객체
 *
 *  기차 충돌
 * 함수를 호출하고 반환하는 객체의 함수를 호출하고 반환하는 객체의 ...
 * 조잡하므로 사용 x
 *
 *  잡종 구조
 * 절반은 객체, 절반은 자료 구조인 잡종 구조는 양쪽의 단점을 모두 가짐
 *
 *  구조체 감추기
 * 객체는 뭘 하라고 해야 함
 * 드러내라 x
 * 메소드/객체의 연쇄 x
 * 하나의 메소드를 통해 구현
 *
 * # 자료 전달 객체
 * : DTO
 * 데이터베이스에 저장된 정보를 코드에서 사용할 객체로 변환
 *
 *  활성 레코드
 * DTO의 특수한 형태
 * 데이터베이스 테이블이나 소스 자료를 직접 변환한 결과
 * 활성 레코드는 "자료구조"
 *
 * # 결론
 * 객체 : 동작 공개, 자료 숨김. 동작 변경 힘듦, 새 타입 추가 쉬움.
 * 자료구조 : 자료 노출. 동작 추가 쉬움, 새 자료구조 추가 어려움.
 *
 * 새 타입 추가하는 유연성 필요 -> 객체
 * 새 동작 추가하는 유연성 필요 -> 자료 구조 + 절차적 코드
 *
 */
public class ch6 {
    class ObjectExample {
        interface Shape {
            public double area();
        }

        class Square implements Shape {
            private Point topLeft;
            private double side;

            public double area() {
                return side * side;
            }
        }

        class Rectangle implements Shape {
            private Point topLeft;
            private double height;
            private double width;

            public double area() {
                return height * width;
            }
        }
    }

    class DataStructureExample {
        class Square {
            public Point topLeft;
            public double side;
        }

        class Rectangle {
            public Point topLeft;
            public double height;
            public double width;
        }

        class Geometry {
            public double area(Object shape) throws NoSuchObjectException
            {
                if (shape instanceof Square) {
                    Square s = (Square) shape;
                    return s.side * s.side;
                }
                else if (shape instanceof Rectangle) {
                    Rectangle r = (Rectangle) shape;
                    return r.height * r.width;
                }
                throw new NoSuchObjectException(shape.getClass().getName());
            }
        }
    }

}
