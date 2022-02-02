package solver;

public class Solution {

    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (max1 < num) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 < num && max1 != num) {
                max3 = max2;
                max2 = num;
            } else if (max3 < num && max1 != num && max2 != num) {
                max3 = num;
            }
            min = Math.min(min, num);
        }
        return max3 != max2 && max2 != min ? max3 : max1;
    }
}
