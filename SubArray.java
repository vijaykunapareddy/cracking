import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(-7);
		a.add(8);
		int b = 3;
		slidingMaximum(a, b);
	}
	
	public static ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		int[] arr = new int[a.size()];
		for(int i = 0; i < a.size(); i++) {
		    arr[i] = a.get(i);
		}
	    for(int i=0;i<arr.length;i++){
	        if(i+b<=a.size()){
	            int k[] = Arrays.copyOfRange(arr, i, i+b);
	            Arrays.sort(k);
	            int value = k.length;
	            System.out.print(k[value -1]+" ");
	        }
	    }
		return null;
	}
}
