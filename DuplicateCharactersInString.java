import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		String k = "Vijayyy";
		int l = k.length();
		ArrayList<Character> al = new ArrayList<Character>();
		Set<Character> ss = new HashSet<Character>();
		for (int i = 0; i < l; i++) {
			al.add(k.charAt(i));
			ss.add(k.charAt(i));
		}
		System.out.println(al.size());
		System.out.println(l);
		System.out.println(ss.size());
	}

}
