package solver;

public class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) == 0) {
                left++;
            } else if ((nums[right] & 1) == 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            } else {
                right--;
            }
        }
        return nums;
    }
}
