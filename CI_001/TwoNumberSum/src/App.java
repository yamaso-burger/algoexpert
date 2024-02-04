

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("System started.");

        int[] array = {3,5,-4,8,11,1,-1,6};
        int target = 10;
        int[] answer = Solution3.twoNumberSum(array, target);
        System.out.println(answer[0] + "," + answer[1]);

        // Map<Integer, Boolean> hash = new HashMap<>();
        // hash.put(1, true);
        // System.out.println(hash.get(1));
        // System.out.println(hash.get(2));
        

        // Set<Integer> hashSet = new HashSet<>();
        // hashSet.add(1);
        // System.out.println(hashSet.contains(1));
        // System.out.println(hashSet.contains(2));

        return;
    }
}
