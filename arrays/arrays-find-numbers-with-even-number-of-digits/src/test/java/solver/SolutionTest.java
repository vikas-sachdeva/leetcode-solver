package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void findNumbersTest1() {
        AssertionsForInterfaceTypes.assertThat(solution.findNumbers(new int[]{12, 345, 2, 6, 7896})).isEqualTo(2);
    }

    @Test
    public void findNumbersTest2() {
        AssertionsForInterfaceTypes.assertThat(solution.findNumbers(new int[]{555, 901, 482, 1771})).isEqualTo(1);
    }
}
