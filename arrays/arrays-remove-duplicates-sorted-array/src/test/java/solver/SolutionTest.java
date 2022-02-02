package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void removeElementTest1() {
        int[] arr = new int[]{1, 1, 2};
        int k = solution.removeDuplicates(arr);
        AssertionsForInterfaceTypes.assertThat(k).isEqualTo(2);
        AssertionsForInterfaceTypes.assertThat(Arrays.stream(arr).limit(k)).containsOnly(1, 2);
    }

    @Test
    public void removeElementTest2() {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(arr);
        AssertionsForInterfaceTypes.assertThat(k).isEqualTo(5);
        AssertionsForInterfaceTypes.assertThat(Arrays.stream(arr).limit(k)).containsOnly(0, 1, 2, 3, 4);
    }

    @Test
    public void removeElementTest3() {
        int[] arr = new int[]{};
        int k = solution.removeDuplicates(arr);
        AssertionsForInterfaceTypes.assertThat(k).isEqualTo(0);
        AssertionsForInterfaceTypes.assertThat(Arrays.stream(arr).limit(k)).isEmpty();
    }
}
