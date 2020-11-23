package programmers;

/**
 * @author Gatsjy
 * @since 2020-10-04
 * realize dreams myself
 */
public class programmers_문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = false;
        // 문자열의 길이가 4혹은 6이고, 숫자로만 구성되어있는 지 확인하는 함수.
        if(s.length() == 4 || s.length() == 6){
            int i;
            for(i = 0 ; i < s.length(); i++){
                if(!Character.isDigit(s.charAt(i))){
                    answer = false;
                    break;
                }
            }
            if(i == s.length()) answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "a234";
        programmers_문자열다루기기본 solution = new programmers_문자열다루기기본();
        solution.solution(s);
    }
}
