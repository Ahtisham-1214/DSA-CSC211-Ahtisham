package DSA_Lab02_Ahtisham;

/**
 * Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
 * <p>
 * The value of |x| is defined as:
 * <p>
 * x if x >= 0.
 * -x if x < 0.
 * <p>
 *
 * Example 1:
 * <p>
 * Input: nums = [1,2,2,1], k = 1
 * Output: 4
 * Explanation: The pairs with an absolute difference of 1 are:
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * Example 2:
 * <p>
 * Input: nums = [1,3], k = 3
 * Output: 0
 * Explanation: There are no pairs with an absolute difference of 3.
 * Example 3:
 * <p>
 * Input: nums = [3,2,1,5,4], k = 2
 * Output: 3
 * Explanation: The pairs with an absolute difference of 2 are:
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 *
 *
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * 1 <= k <= 99
 */
public class Problem_04 {
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    if (nums[i] - nums[j] == k)
                        count++;
                } else if (nums[j] > nums[i]) {
                    if (nums[j] - nums[i] == k)
                        count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
    int []nums = {1,2,2,1};
    System.out.println(countKDifference(nums, 1));
    }
}
