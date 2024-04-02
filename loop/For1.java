package loop;

// <for문1> 섹션5 강의6
//for문도 while문과 같은 반복문이고, 코드를 반복 실행하는 역할을 한다
// for문은 주로 반복 횟수가 정해져 있을 때 사용한다
//좀 더 코드를 더 깔끔하게 구조화해서 짤 수가 있다
// for문 형태
// for(1.초기식; 2.조건식; 4.증감식;{3.코드}
// for문은 다음 순서대로 실행된다
// 1. 초기식이 실행된다 변수를 선언한다 주로 반복횟수와 관련된 변수를 선언하고 초기화할 때 사용한다 초기식은 1번만 실행된다
// 2. 조건식을 검증한다 참이면 코드를 실행하고, 거짓이면 for문을 빠져나간다
// 3. 코드를 실행한다
// 4.코드가 종료되면 증감식을 실행한다 주로 초기식에 넣은 반복 횟수와 관련된 변수의 값을 증가할 때 사용한다
// 5. 다시 2. 조건식 부터 시작한다

// for문은 복잡해 보이지만 while문을 조금 더 편하게 다룰 수 있도록 구조화 한 것 뿐이다
// 예를 들어 1부터 10까지 출력하는 for문은 다음과 같다



public class For1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}