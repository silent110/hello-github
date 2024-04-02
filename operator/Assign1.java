package operator;

// <대입 연산자> 섹션3 강의 7
// 대입 연산자는(=)는 값을 변수에 할당하는 연산자다.
//이 연산자를 사용하면 변수에 값을 할당할 수 있다.
//예를 들어 int a = 1는 a라는 변수에 1이라는 값을 할당한다.

// 축약(복합)대입 연산자
// 산술연산자와 대입 연산자를 한번에 축약해서 사용할 수 있는데, 이것을 축약(복합) 대입 연산자라 한다.
// 이 연산자는 연산과 대입을 한번에 축약해서 처리한다.
//다음왼쪽과 오른쪽의 결과는 같다.
// i = i + 3 -> i += 3
// i = i * 4 -> i *= 4





public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8 (5 + 3): a = a + 3
        a -= 2; // 6 (8 - 2): a = a - 2
        a *= 4; // 24 (6 * 4): a = a * 4
        a /= 3; // 8 (24 / 3): a = a / 3
        a %= 5; // 3 ( 8 % 3): a = a % 3
        System.out.println(a);
    }
}
