package solver;

import java.util.HashSet;

public class Solution {

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {
            if (j % 2 == 0 && set.contains(j / 2)) {
                return true;
            } else if (set.contains(2 * j)) {
                return true;
            } else {
                set.add(j);
            }
        }
        return false;
    }
}
