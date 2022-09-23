package study._220920;

/*

  - 문제
   String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요
   seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

  - 제한사항
   1) seoul은 길이 1 이상, 1000 이하인 배열입니다.
   2) seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
   3) "Kim"은 반드시 seoul 안에 포함되어 있습니다.

 */

public class Lv1_15 {

    public static void main(String[] args) {

        String solution = solution(new String[]{"Jane", "Kim"});

        System.out.println(solution);
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].indexOf("Kim") > -1) {
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }
}


/*

    - 일반배열을 ArrayList로 변환
     > Arrays.asList

    - indexOf(arg)
     > arg 원소가 몇번째 리스트에 있는지 조회

 */


