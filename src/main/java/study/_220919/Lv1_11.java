package study._220919;

/*

  - 문제
   문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

  - 제한사항
   1) s의 길이는 1 이상 5이하입니다.
   2) s의 맨앞에는 부호(+, -)가 올 수 있습니다.
   3) s는 부호와 숫자로만 이루어져있습니다.
   4) s는 "0"으로 시작하지 않습니다.

 */

public class Lv1_11 {

    public static void main(String[] args) {

        int soluion = solution("-1234");
        System.out.println(soluion);
    }

    public static int solution(String s) {
        int answer = 0;

        answer = Integer.valueOf(s);
        return answer;
    }
}


/*



 */


