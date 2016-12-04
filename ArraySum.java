import java.util.ArrayList;


public class ArraySum {

	static int[] arr = {0,1};
	static int  count = 0;
	static int  result = 1;
	static ArrayList<Integer> al = new ArrayList<Integer>();
	public static void main(String[] args) {
		recursion();
		for (Integer val : al) {
			System.out.println(val);
		}
	}
	
	public static void recursion(){
		int i =0;
		while (i < arr.length) {
			if (count!=i) {
				result *= arr[i];
			}
			i++;
		}
		count++;
		al.add(result);
		result = 1;
		if (count < arr.length) {
			recursion();
		}
		
		
	}
}
