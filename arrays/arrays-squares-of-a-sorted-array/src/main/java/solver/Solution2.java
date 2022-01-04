package solver;

public class Solution2 {

    public int[] sortedSquares(int[] nums) {
        int output[] = new int[nums.length];

        int outputIndex = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                output[outputIndex--] = nums[right] * nums[right];
                right--;
            } else {
                output[outputIndex--] = nums[left] * nums[left];
                left++;
            }
        }
        return output;
    }
}
