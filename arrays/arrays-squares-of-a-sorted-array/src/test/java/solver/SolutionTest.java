package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    @Test
    public void sortedSquaresTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.sortedSquares(new int[]{-4, -1, 0, 3, 10})).containsExactly(0, 1, 9, 16, 100);
        AssertionsForInterfaceTypes.assertThat(solution2.sortedSquares(new int[]{-4, -1, 0, 3, 10})).containsExactly(0, 1, 9, 16, 100);
    }

    @Test
    public void sortedSquaresTest2() {
        AssertionsForInterfaceTypes.assertThat(solution1.sortedSquares(new int[]{-7, -3, 2, 3, 11})).containsExactly(4, 9, 9, 49, 121);
        AssertionsForInterfaceTypes.assertThat(solution2.sortedSquares(new int[]{-7, -3, 2, 3, 11})).containsExactly(4, 9, 9, 49, 121);
    }
}
