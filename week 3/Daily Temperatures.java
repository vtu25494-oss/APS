import java.util.*;

public class Daily Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < n; i++) {
            
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx; 
            }
            stack.push(i);
        }

        
        return answer;
    }

    public static void main(String[] args) {
        int[] temps1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temps1))); // [1,1,4,2,1,1,0,0]

        int[] temps2 = {30, 40, 50, 60};
        System.out.println(Arrays.toString(dailyTemperatures(temps2))); // [1,1,1,0]

        int[] temps3 = {30, 60, 90};
        System.out.println(Arrays.toString(dailyTemperatures(temps3))); // [1,1,0]
    }
}