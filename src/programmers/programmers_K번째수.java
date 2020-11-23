package programmers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Gatsjy
 * @since 2020-10-04
 * realize dreams myself
 */
public class programmers_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i < commands.length; i++){
            ArrayList<Integer> tmpArr = new ArrayList<>();
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                tmpArr.add(array[j]);
            }
            Collections.sort(tmpArr);
            answer[i] = tmpArr.get(commands[i][2]-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array= {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        programmers_K번째수 solution = new programmers_K번째수();
        solution.solution(array, commands);
    }
}
