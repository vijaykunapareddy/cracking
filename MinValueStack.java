import java.util.Scanner;
import java.util.Stack;


public class MinValueStack {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		int minValue = Integer.MAX_VALUE;
		int[] array = {10,20, 30, 2, 40, 50, 60, 70, 15};
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			int x = array[i];
			if (x < minValue) {
				s.push(minValue);
				minValue = x;
			}
			s.push(x);
		}
		int i = 0;
		int defaultValue = Integer.MAX_VALUE;
		while (!s.isEmpty()) {
			int k = s.peek();
			System.out.println("peek--->"+k);
			if (k<defaultValue) {
				result = k;
				defaultValue = k;
				System.out.println(result);
			}
			s.pop();
			i++;
		}
		
	}
}
