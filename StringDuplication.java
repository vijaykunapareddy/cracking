import java.util.Arrays;


public class StringDuplication {

	/**
	 * Merge Sort and O(n log n)
	 */
	public static void main(String[] args) {

		String val ="ajay";
		char[] val1 = val.toCharArray();
		Arrays.sort(val1);
		System.out.println(1+"237");
		for (int i = 0; i <val1.length-1; i++) {
			int j =i+1;
			if (val1[i] == val1[j]) {
				System.out.println("duplication");
				System.exit(0);
			}else{
				System.out.println("no duplication");
			}
		}
	}
	
}
