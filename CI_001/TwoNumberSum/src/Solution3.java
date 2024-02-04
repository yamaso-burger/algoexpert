import java.util.Arrays;

public class Solution3 {
    // Sorted Both Edges
    // Time Complexity: O(N)
    // Space Complexity: Constant
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        // Sort array by ascending order
        Arrays.sort(array);
        
        int left = 0;
        int right = array.length - 1;
        while(left != right) {
            int actualSum = array[left] + array[right];
            if(targetSum == actualSum) {
                return new int[]{array[left], array[right]};
            } else if(targetSum > actualSum) {
                left++;
            } else if(targetSum < actualSum) {
                right--;
            }
        }
        return new int[0];
      }
}
