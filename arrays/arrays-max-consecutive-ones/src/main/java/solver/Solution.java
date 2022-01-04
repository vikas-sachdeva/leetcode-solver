package solver;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max1s = 0;
        int current1s = 0;
        for (int num : nums) {
            if (num == 1) {
                current1s++;
            } else {
                max1s = Math.max(max1s, current1s);
                current1s = 0;
            }
        }
        return Math.max(max1s, current1s);
    }
}
