import java.util.*;

/**
 * @author Gatsjy
 * @since 2020-10-04
 * realize dreams myself
 */

class Solution {

    // String a,b와 operator을 계산 하는 메서드
    int calOp(String a, String b, String op){
        if(op.equals("*")){
           return Integer.parseInt(a) * Integer.parseInt(b);
        }else if(op.equals("-")){
            return Integer.parseInt(a) - Integer.parseInt(b);
        }else if(op.equals("+")){
            return Integer.parseInt(a) + Integer.parseInt(b);
        }
        return -1;
    }

    int[] solution(String s, String op){

        // 답은 언제나 s.length()-1 개
        int[] res = new int[s.length()-1];

        // substring 한 값을 calOp를 통해 계산 후 return
        for(int i = 1 ; i < s.length(); i++){
            String a = s.substring(0,i);
            String b = s.substring(i);
            res[i-1] = calOp(a,b,op);
        }

        return res;
    }

    public static void main(String[] args) {
        // (1)
        //String s = "1234";
        //String op = "+";
        // (2)
        //String s = "987987";
        //String op = "-";
        // (3)
        String s = "31402";
        String op = "*";
        Solution solution = new Solution();
        int[] res = solution.solution(s,op);

        // 결과 확인 용
        Arrays.stream(res).forEach(System.out::println);
    }
}