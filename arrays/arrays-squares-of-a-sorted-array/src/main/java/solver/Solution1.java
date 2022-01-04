package solver;

public class Solution1 {

    public int[] sortedSquares(int[] nums) {
        int output[] = new int[nums.length];

        int firstPositiveIndex = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                firstPositiveIndex = i;
                break;
            }
        }
        int i = firstPositiveIndex;
        int j = firstPositiveIndex - 1;
        int outIndex = 0;
        while (i < nums.length && j >= 0) {
            if (nums[i] < -nums[j]) {
                output[outIndex++] = nums[i] * nums[i];
                i++;
            } else {
                output[outIndex++] = nums[j] * nums[j];
                j--;
            }
        }

        while (i < nums.length) {
            output[outIndex++] = nums[i] * nums[i];
            i++;
        }
        while (j >= 0) {
            output[outIndex++] = nums[j] * nums[j];
            j--;
        }
        return output;
    }
}
