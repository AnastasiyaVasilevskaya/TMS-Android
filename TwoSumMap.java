import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {
    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (numIndex.containsKey(diff)) {
                return new int[]{numIndex.get(diff), i};
            }
            numIndex.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] result = twoSumMap(nums, target);

        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("Решение не найдено.");
        }
    }
}
