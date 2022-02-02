package solver;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] temp = new boolean[nums.length + 1];
        for (int num : nums) {
            temp[num] = true;
        }
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 1; i < temp.length; i++) {
            if (!temp[i]) {
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }
}
