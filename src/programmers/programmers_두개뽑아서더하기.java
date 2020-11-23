package programmers;

import java.util.*;

/**
 * @author Gatsjy
 * @since 2020-10-04
 * realize dreams myself
 */
public class programmers_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] number = {2,1,3,4,1};
        programmers_두개뽑아서더하기 solution = new programmers_두개뽑아서더하기();
        solution.solution(number);
    }
}
