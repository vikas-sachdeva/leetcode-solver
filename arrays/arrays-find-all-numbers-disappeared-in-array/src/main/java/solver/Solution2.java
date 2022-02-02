package solver;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = 0;
                while (temp != 0 && temp != nums[temp - 1]) {
                    int temp1 = nums[temp - 1];
                    nums[temp - 1] = temp;
                    temp = temp1;
                }

            }
        }
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
