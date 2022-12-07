package study._221206;

/*

  - 문제
   경화는 과수원에서 귤을 수확했습니다. 경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다.
   그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고 싶습니다.

   예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다.
   경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면,
   귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.

   경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다.
   경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

  - 제한사항
   1) 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
   2) 1 ≤ tangerine의 원소 ≤ 10,000,000

 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Lv2_22 {

    public static void main(String[] args) {

        int solution = solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});

        System.out.print(solution);

    }

    public static int solution(int k, int[] tangerine) {

        int maxSize = 0;
        int cnt = 0;
        int sum = 0;

        for(int tanger : tangerine) {
            if(tanger > maxSize) {
                maxSize = tanger;
            }
        }

        int[] sizeArr = new int[maxSize];

        for(int i=0; i<tangerine.length; i++) {
            int size = tangerine[i];

            sizeArr[size-1]++;
        }

        Arrays.sort(sizeArr);

        int startSize = 0;
        int preCnt = maxSize;

        for (int i=sizeArr.length-1; i>=0; i--) {

            if(k <= 0) {
                break;
            }

            cnt ++;
            k -= sizeArr[i];
        }

        return cnt;
    }
}

/*

6	[1, 3, 2, 5, 4, 5, 2, 3]	3
4	[1, 3, 2, 5, 4, 5, 2, 3]	2
2	[1, 1, 1, 1, 2, 2, 2, 3]	1

 */


