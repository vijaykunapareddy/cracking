import java.util.Arrays;


public class LogesgPalindrom {

	static int k = 0;
	static int front = 0;
	static int back = 0;
	public static void main(String[] args) {
	
		
		String value ="ABCBDHJKFIFABCCBADHUWIJDNAH";
		recursive(value, k);
	}

	private static void recursive(String value, int k) {
		for (int i = k+1; i < value.length(); i++) {
			if (value.charAt(i)==value.charAt(k)) {
				front = k;
				back = i;
				if (value.charAt(++front) == value.charAt(--back)) {
					recursive(value);
				}else{
					front = 0;
					back = 
				}
			}
		}
	}

}
