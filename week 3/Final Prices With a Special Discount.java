import java.util.*;
public class  Final Prices With a Special Discount {
public static int[] finalPrices(int[] prices) {
int n = prices.length;
int[] answer = Arrays.copyOf(prices, n); 
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < n; i++) {
while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
int idx = stack.pop();
answer[idx] = prices[idx] - prices[i]; // apply discount
}
stack.push(i);
}
return answer;
}
public static void main(String[] args) {
int[] prices1 = {8, 4, 6, 2, 3};
System.out.println(Arrays.toString(finalPrices(prices1)));
int[] prices2 = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(finalPrices(prices2))); 
int[] prices3 = {10, 1, 1, 6};
System.out.println(Arrays.toString(finalPrices(prices3))); 
}
}