package operator;
//<연산자 우선순위> 섹션 3 강의3
// 수학에서 1 + 2 * 3 연산자 우선순위가 높은 걸 먼저 수행한다.
// 자바도 마찬가지다. 자바도 사람이 코드를 작성한다. 기게가 코드를 작성하는게 아니기 때문에,
// 사람이 알아들을 수 있는 말로 하게 된다.
// 코드로 연산자 우선순위를 확인해보자
// int sum1 = 1 + 2 * 3; -> 1 + (2 * 3)
// int sum2 = (1 + 2) * 3;
//출력을 해보면 sum1=  7이 나온다. 연산자 우선순위에 따라 곱셈이 먼저 수행된다.
// 연산자 우선순위를 변경하려면 수학과 마찬가지로 괄호()를 사용하면 된다.
//()를 사용한 곳이 먼저 사용된다.
//그래서 sum2는 괄호를 사용해서 덧셈이 먼저 처리되도록 했다.





public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
