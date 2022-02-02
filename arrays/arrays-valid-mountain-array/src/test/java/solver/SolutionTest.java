package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void validMountainArrayTest1() {
        int[] arr = new int[]{2, 1};
        AssertionsForInterfaceTypes.assertThat(solution.validMountainArray(arr)).isFalse();
    }

    @Test
    public void validMountainArrayTest2() {
        int[] arr = new int[]{3, 5, 5};
        AssertionsForInterfaceTypes.assertThat(solution.validMountainArray(arr)).isFalse();
    }

    @Test
    public void validMountainArrayTest3() {
        int[] arr = new int[]{0, 3, 2, 1};
        AssertionsForInterfaceTypes.assertThat(solution.validMountainArray(arr)).isTrue();
    }

    @Test
    public void validMountainArrayTest4() {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        AssertionsForInterfaceTypes.assertThat(solution.validMountainArray(arr)).isFalse();
    }
}
