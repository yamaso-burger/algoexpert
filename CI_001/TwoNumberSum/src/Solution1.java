class Solution1 {
  // Two For-loops
  // Time Complexity: O(N^2)
  // Space Complexity: Constant
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    for(int i = 0; i < array.length; i++) {
        int firstNum = array[i];
        for(int j = i+1; j < array.length; j++) {
            int secondNum = array[j];
            if (firstNum + secondNum == targetSum) {
                return new int[]{firstNum, secondNum};
            }
        }
    }
    return new int[0];
  }
}
