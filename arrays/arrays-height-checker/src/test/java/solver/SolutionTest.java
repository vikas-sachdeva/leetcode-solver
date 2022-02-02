package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void heightCheckerTest1() {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        AssertionsForInterfaceTypes.assertThat(solution.heightChecker(heights)).isEqualTo(3);
    }

    @Test
    public void heightCheckerTest2() {
        int[] heights = new int[]{5, 1, 2, 3, 4};
        AssertionsForInterfaceTypes.assertThat(solution.heightChecker(heights)).isEqualTo(5);
    }

    @Test
    public void heightCheckerTest3() {
        int[] heights = new int[]{1, 2, 3, 4, 5};
        AssertionsForInterfaceTypes.assertThat(solution.heightChecker(heights)).isEqualTo(0);
    }

    @Test
    public void heightCheckerTest4() {
        int[] heights = new int[]{2, 1, 2, 1, 1, 2, 2, 1};
        AssertionsForInterfaceTypes.assertThat(solution.heightChecker(heights)).isEqualTo(4);
    }
}
