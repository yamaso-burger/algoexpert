import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    // Using hash-table
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            if (hashSet.contains(targetSum - num)) {
                return new int[]{num, targetSum - num};
            } else {
                hashSet.add(num);
            }
        }
        return new int[0];
      }
}
