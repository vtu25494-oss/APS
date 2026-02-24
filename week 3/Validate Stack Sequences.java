import java.util.*;

class Validate Stack Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0; // pointer for popped
        
        for (int num : pushed) {
            stack.push(num);
            
            // Keep popping while top matches popped[j]
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        
        return stack.isEmpty();
    }
}