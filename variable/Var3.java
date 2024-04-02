package variable;
//<변수 값 변경> 섹션2 강의 2
// 변수는 변할 수 있는 수
// 쉽게 말해서 변수 a에 저장된 값을 언제든지 바꿀 수 있다는 뜻이다.
// 중간에 변수의 값을 변경해보자.
// 변수를 하나 선언 -> int a; a라는 데이터를 담을 수 있는 그릇이 만들어진다.
// a=10; 변수 초기화 -> a에다가 10이 들어간다.그리고 출력
// 변수의 값 변경해보자  -> a = 50; -> 변수의 값 변경
// 기존에 있던 10은 사라진다. 완전히 제거가 되고 50으로 바뀐다.

// 분석
// 변수의 값이 변경된 후에는 10대신 50이 출력된 걸 확인
// ~
// 변수의 값을 변경하면 변수에 들어있던 기존 값은 삭제된다.


public class Var3 {
    public static void main(String[] args){
        int a;
        a = 10;
        System.out.println(a);
        a = 50;
        System.out.println(a);
    }
}
// 변수는 바꾸고 싶을 때 바꿀 수 있다
// 변수 선언
// 변수 초기화 a(10)

