import java.util.Arrays;


public class PermutationStrings {

	public static void main(String[] args) {
		
		String k = "vijay";
		String l = "aijvy";
	    char[] a = k.toCharArray();
	    char[] b = l.toCharArray();
	    System.out.println(a);
	    System.out.println(b);
	    Arrays.sort(a);
	    Arrays.sort(b);
	    boolean o = Arrays.equals(a, b);
	    System.out.println(o);
	}

}
