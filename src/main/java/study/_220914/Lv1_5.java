package study._220914;

/*

  - 문제
   정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

  - 제한사항
   1) arr은 길이 1 이상, 100 이하인 배열입니다.
   2) arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

 */

public class Lv1_5 {

    public static void main(String[] args) {

        class Solution {

            public double solution(int[] arr) {
                double answer = 0;

                for (int a=0; a<arr.length; a ++) {
                    answer = answer + arr[a];
                }

                answer = answer / arr.length;

                return answer;
            }
        }
    }
}
