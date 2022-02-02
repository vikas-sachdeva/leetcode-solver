package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void removeElementTest1() {
        int[] arr = new int[]{3, 2, 2, 3};
        int k = solution.removeElement(arr, 3);
        AssertionsForInterfaceTypes.assertThat(k).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(Arrays.stream(arr).limit(k)).containsOnly(2, 2);
    }

    @Test
    public void removeElementTest2() {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k = solution.removeElement(arr, 2);
        AssertionsForInterfaceTypes.assertThat(k).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(Arrays.stream(arr).limit(k)).containsOnly(0, 1, 4, 0, 3);
    }
}
