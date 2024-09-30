import java.util.ArrayList;
import java.util.List;
public class MaximizePairProduct {


    public static void main(String[] args) {
        int[] nums = {20, 16, 2, 1, 5};
        int targetSum = 18;
        int[] result = findPairWithMaxProduct(nums, targetSum);

        if (result != null) {
            System.out.println("Pair with maximum product: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] findPairWithMaxProduct(int[] nums, int targetSum) {
        // List to hold valid pairs
        List<int[]> pairs = new ArrayList<>();

        // Find all pairs where the sum equals targetSum
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    pairs.add(new int[]{nums[i], nums[j]});
                }
            }
        }

        // Variables to store the best pair and the maximum product
        int[] bestPair = null;
        int maxProduct = Integer.MIN_VALUE;

        // Iterate through each pair and calculate the product
        for (int[] pair : pairs) {
            int product = pair[0] * pair[1];
            if (product > maxProduct) {
                maxProduct = product;
                bestPair = pair;
            }
        }

        return bestPair;
}

}


// import java.util.HashMap;

// public class Main {

//     public static void main(String[] args) {
//         int[] nums = {20, 16, 2, 1, 5};
//         int targetSum = 18;
//         int[] result = findPairWithMaxProduct(nums, targetSum);

//         if (result != null) {
//             System.out.println("Pair with maximum product: (" + result[0] + ", " + result[1] + ")");
//         } else {
//             System.out.println("No pair found.");
//         }
//     }

//     public static int[] findPairWithMaxProduct(int[] nums, int targetSum) {
//         // Map to store the complement (targetSum - current value) and the current value
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int[] bestPair = null;
//         int maxProduct = Integer.MIN_VALUE;

//         for (int num : nums) {
//             // Calculate the complement needed to form the pair
//             int complement = targetSum - num;

//             // Check if the complement exists in the map
//             if (map.containsKey(complement)) {
//                 int product = complement * num;
//                 if (product > maxProduct) {
//                     maxProduct = product;
//                     bestPair = new int[]{complement, num};
//                 }
//             }

//             // Store the current number in the map
//             map.put(num, complement);
//         }

//         return bestPair;
//     }
// }
// // 


// import java.util.Arrays;

// public class Main {

//     public static void main(String[] args) {
//         int[] nums = {20, 16, 2, 1, 5};
//         int targetSum = 18;
//         int[] result = findPairWithMaxProduct(nums, targetSum);

//         if (result != null) {
//             System.out.println("Pair with maximum product: (" + result[0] + ", " + result[1] + ")");
//         } else {
//             System.out.println("No pair found.");
//         }
//     }

//     public static int[] findPairWithMaxProduct(int[] nums, int targetSum) {
//         // Sort the array
//         Arrays.sort(nums);

//         int low = 0;
//         int high = nums.length - 1;
//         int maxProduct = Integer.MIN_VALUE;
//         int[] bestPair = null;

//         // Two-pointer approach to find pairs with target sum
//         while (low < high) {
//             int sum = nums[low] + nums[high];

//             // If sum is equal to target, check the product
//             if (sum == targetSum) {
//                 int product = nums[low] * nums[high];
//                 if (product > maxProduct) {
//                     maxProduct = product;
//                     bestPair = new int[]{nums[low], nums[high]};
//                 }
//                 low++;
//                 high--;
//             } 
//             // Move pointers based on sum comparison
//             else if (sum < targetSum) {
//                 low++;
//             } else {
//                 high--;
//             }
//         }

//         return bestPair;
//     }
// }
