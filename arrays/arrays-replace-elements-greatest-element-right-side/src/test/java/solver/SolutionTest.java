package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void mergeTest1() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        AssertionsForInterfaceTypes.assertThat(solution.replaceElements(arr)).containsExactly(18, 6, 6, 6, 1, -1);
    }

    @Test
    public void mergeTest2() {
        int[] arr = new int[]{400};
        AssertionsForInterfaceTypes.assertThat(solution.replaceElements(arr)).containsExactly(-1);
    }
}