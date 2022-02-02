package solver;

public class Solution {

    public int heightChecker(int[] heights) {
        int count = 0;
        int[] heightsCount = new int[101];
        int min = 100;
        int max = 1;
        for (int height : heights) {
            heightsCount[height]++;
            min = Math.min(min, height);
            max = Math.max(max, height);
        }
        int k = 0;
        int i = min;
        while (i <= max) {
            if (heightsCount[i] != 0) {
                if (heights[k] != i) {
                    count++;
                }
                k++;
                heightsCount[i]--;
            } else {
                i++;
            }
        }
        return count;
    }
}
