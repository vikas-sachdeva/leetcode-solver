package solver;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void findMaxConsecutiveOnesTest1(){
        AssertionsForInterfaceTypes.assertThat(solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})).isEqualTo(3);
    }

    @Test
    public void findMaxConsecutiveOnesTest2(){
        AssertionsForInterfaceTypes.assertThat(solution.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})).isEqualTo(2);
    }
}
