package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void duplicateZerosTest1() {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);
        AssertionsForInterfaceTypes.assertThat(arr).containsExactly(1, 0, 0, 2, 3, 0, 0, 4);
    }

    @Test
    public void duplicateZerosTest2() {
        int[] arr = new int[]{1, 2, 3};
        solution.duplicateZeros(arr);
        AssertionsForInterfaceTypes.assertThat(arr).containsExactly(1, 2, 3);
    }

    @Test
    public void duplicateZerosTest3() {
        int[] arr = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
        solution.duplicateZeros(arr);
        AssertionsForInterfaceTypes.assertThat(arr).containsExactly(8, 4, 5, 0, 0, 0, 0, 0);
    }

    @Test
    public void duplicateZerosTest4() {
        int[] arr = new int[]{8, 0, 5, 0, 0, 4, 0, 7};
        solution.duplicateZeros(arr);
        AssertionsForInterfaceTypes.assertThat(arr).containsExactly(8, 0, 0, 5, 0, 0, 0, 0);
    }
}
