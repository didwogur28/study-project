package study._220922;

/*

  - 문제
   문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
   예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

  - 제한사항
   1) s는 길이 1 이상, 길이 8 이하인 문자열입니다.
   2) s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

 */

import java.util.Arrays;

public class Lv1_25 {

    public static void main(String[] args) {

        boolean solution = solution("1234");

        System.out.println(solution);

    }

    public static boolean solution(String s) {
        boolean answer = true;
        int leng = s.length();
        int chkType = 0;

        if(leng !=4 && leng != 6) {
            return false;
        }

        try {
            for (int i=0; i<s.split("").length; i++) {
                chkType = Integer.parseInt(s.split("")[i]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


/*


 */


