package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void moveZeroesTest1() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(arr);
        AssertionsForInterfaceTypes.assertThat(arr).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    public void moveZeroesTest2() {
        int[] arr = new int[]{0};
        solution.moveZeroes(arr);
        AssertionsForInterfaceTypes.assertThat(arr).containsExactly(0);
    }
}