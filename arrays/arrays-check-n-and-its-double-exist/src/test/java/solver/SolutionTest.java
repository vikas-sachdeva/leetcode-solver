package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void checkIfExistTest1() {
        int[] arr = new int[]{10, 2, 5, 3};
        AssertionsForInterfaceTypes.assertThat(solution.checkIfExist(arr)).isTrue();
    }

    @Test
    public void checkIfExistTest2() {
        int[] arr = new int[]{7, 1, 14, 11};
        AssertionsForInterfaceTypes.assertThat(solution.checkIfExist(arr)).isTrue();
    }

    @Test
    public void checkIfExistTest3() {
        int[] arr = new int[]{3, 1, 7, 11};
        AssertionsForInterfaceTypes.assertThat(solution.checkIfExist(arr)).isFalse();
    }

    @Test
    public void checkIfExistTest4() {
        int[] arr = new int[]{-2, 0, 10, -19, 4, 6, -8};
        AssertionsForInterfaceTypes.assertThat(solution.checkIfExist(arr)).isFalse();
    }
}
