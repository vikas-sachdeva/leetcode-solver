package solver;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            index = Math.abs(index) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
