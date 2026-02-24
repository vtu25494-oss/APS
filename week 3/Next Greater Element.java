import java.util.*;

public class Next Greater Element{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

       
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }

        
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }

        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2))); // Output: [-1, 3, -1]

        int[] nums1b = {2, 4};
        int[] nums2b = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1b, nums2b))); // Output: [3, -1]
    }
}