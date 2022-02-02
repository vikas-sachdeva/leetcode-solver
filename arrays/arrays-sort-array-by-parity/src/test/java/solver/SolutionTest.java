package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void sortArrayByParityTest1() {
        int[] nums = new int[]{3, 1, 2, 4};
        AssertionsForInterfaceTypes.assertThat(solution.sortArrayByParity(nums)).containsExactly(4, 2, 1, 3);
    }

    @Test
    public void sortArrayByParityTest2() {
        int[] nums = new int[]{0};
        AssertionsForInterfaceTypes.assertThat(solution.sortArrayByParity(nums)).containsExactly(0);
    }
}
