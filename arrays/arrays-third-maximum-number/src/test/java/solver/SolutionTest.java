package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void thirdMaxTest1() {
        int[] nums = new int[]{3, 2, 1};
        AssertionsForInterfaceTypes.assertThat(solution.thirdMax(nums)).isEqualTo(1);
    }

    @Test
    public void thirdMaxTest2() {
        int[] nums = new int[]{1, 2};
        AssertionsForInterfaceTypes.assertThat(solution.thirdMax(nums)).isEqualTo(2);
    }

    @Test
    public void thirdMaxTest3() {
        int[] nums = new int[]{2, 2, 3, 1};
        AssertionsForInterfaceTypes.assertThat(solution.thirdMax(nums)).isEqualTo(1);
    }

    @Test
    public void thirdMaxTest4() {
        int[] nums = new int[]{1, 2, 2, 5, 3, 5};
        AssertionsForInterfaceTypes.assertThat(solution.thirdMax(nums)).isEqualTo(2);
    }

    @Test
    public void thirdMaxTest5() {
        int[] nums = new int[]{1, 2, Integer.MIN_VALUE};
        AssertionsForInterfaceTypes.assertThat(solution.thirdMax(nums)).isEqualTo(Integer.MIN_VALUE);
    }

}