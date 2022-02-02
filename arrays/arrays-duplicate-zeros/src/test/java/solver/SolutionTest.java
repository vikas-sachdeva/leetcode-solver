package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void mergeTest1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        AssertionsForInterfaceTypes.assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    public void mergeTest2() {
        int[] nums1 = new int[]{1};
        solution.merge(nums1, 1, new int[]{}, 0);
        AssertionsForInterfaceTypes.assertThat(nums1).containsExactly(1);
    }

    @Test
    public void mergeTest3() {
        int[] nums1 = new int[]{0};
        solution.merge(nums1, 0, new int[]{1}, 1);
        AssertionsForInterfaceTypes.assertThat(nums1).containsExactly(1);
    }
}
