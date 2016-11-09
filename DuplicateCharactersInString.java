import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		String k = "Vijayyy";
		int l = k.length();
		Set<Character> ss = new HashSet<Character>();
		for (int i = 0; i < l; i++) {
			ss.add(k.charAt(i));
		}
		if (ss.size()==l) {
			System.out.println("no duplicates");
		}else{
			System.out.println("duplicates");
		}
	}

}
