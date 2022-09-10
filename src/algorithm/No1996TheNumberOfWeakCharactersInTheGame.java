package algorithm;
//[{7,7},{1,2},{9,7},{7,3},{3,10},{9,8},{8,10},{4,3},{1,5},{1,5}]
// answer = 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class No1996TheNumberOfWeakCharactersInTheGame {
    public int numberOfWeakCharacters(int[][] properties) {
        int result = 0;

        Arrays.sort(properties, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        int attackMax = 0;
        int defenseMax = 0;

        for (int[] property : properties) {
            if ((property[0] < attackMax) && (property[1] < defenseMax)) {
                result++;
            }
            attackMax = Math.max(attackMax, property[0]);
            defenseMax = Math.max(defenseMax, property[1]);
        }
        return result;
    }
}
