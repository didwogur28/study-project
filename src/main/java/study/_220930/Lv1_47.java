package study._220930;

/*

  - 문제
   슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다.
   그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다.
   원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.
   이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다.
   역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다.
   오렐리를 위해 실패율을 구하는 코드를 완성하라.

   실패율은 다음과 같이 정의한다.
     스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

   전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
   실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.

  - 제한사항
   1) 스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
   2) stages의 길이는 1 이상 200,000 이하이다.
   3) stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
     - 각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
     - 단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
   4) 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
   5) 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Lv1_47 {

    public static void main(String[] args) {

        int[] solution = solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});

        for(int i=0; i<solution.length; i++) {
            System.out.println(solution[i]);
        }
    }

    public static int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        double result[] = new double[N];

        int i,j = 0;
        int gd_cnt = 0;
        int all_cnt = 0;

        for(i=0; i<N; i++) {
            gd_cnt = 0;
            all_cnt = 0;
            answer[i] = i+1;

            for(j=0; j<stages.length; j++){
                if(i == (stages[j]-1))
                    gd_cnt += 1;
                if(i <= (stages[j]-1))
                    all_cnt += 1;
            }

            result[i] = (double) gd_cnt/all_cnt;
        }

        for(i=N-1; i>=1; i--) {
            for(j=N-1; j >= (N-i); j--){
                if(result[j-1] < result[j]) {
                    double temp = result[j-1];
                    result[j-1] = result[j];
                    result[j] = temp;
                    int temp2 = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = temp2;
                }
            }
        }
        return answer;
    }
}


/*


 */


