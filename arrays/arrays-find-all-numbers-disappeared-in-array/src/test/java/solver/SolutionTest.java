package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution1 solution1 = new Solution1();

    private Solution2 solution2 = new Solution2();

    private Solution3 solution3 = new Solution3();

    @Test
    public void findDisappearedNumbersTest1() {
        AssertionsForInterfaceTypes.assertThat(solution1.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})).containsExactly(5, 6);
        AssertionsForInterfaceTypes.assertThat(solution2.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})).containsExactly(5, 6);
        AssertionsForInterfaceTypes.assertThat(solution3.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})).containsExactly(5, 6);
    }

    @Test
    public void findDisappearedNumbersTest2() {
        AssertionsForInterfaceTypes.assertThat(solution1.findDisappearedNumbers(new int[]{1, 1})).containsExactly(2);
        AssertionsForInterfaceTypes.assertThat(solution2.findDisappearedNumbers(new int[]{1, 1})).containsExactly(2);
        AssertionsForInterfaceTypes.assertThat(solution3.findDisappearedNumbers(new int[]{1, 1})).containsExactly(2);
    }

    @Test
    public void findDisappearedNumbersTest3() {
        AssertionsForInterfaceTypes.assertThat(solution1.findDisappearedNumbers(new int[]{2, 2})).containsExactly(1);
        AssertionsForInterfaceTypes.assertThat(solution2.findDisappearedNumbers(new int[]{2, 2})).containsExactly(1);
        AssertionsForInterfaceTypes.assertThat(solution3.findDisappearedNumbers(new int[]{2, 2})).containsExactly(1);
    }
}
