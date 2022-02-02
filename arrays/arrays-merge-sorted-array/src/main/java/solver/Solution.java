package solver;

public class Solution {

    public void duplicateZeros(int[] arr) {
        int count = 0;
        for (int k : arr) {
            if (k == 0) {
                count++;
            }
        }
        int i = arr.length + count - 1;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == 0) {
                if (i < arr.length) {
                    arr[i--] = arr[j];
                } else {
                    i--;
                }
            }
            if (i < arr.length) {
                arr[i--] = arr[j];
            } else {
                i--;
            }
        }
    }
}
