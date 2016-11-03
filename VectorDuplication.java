import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;


public class VectorDuplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String k = scan.;
		//System.out.println(k);
		Vector<String> v1 = new Vector<String>();
		Vector<String> v2 = new Vector<String>();
		v1.add("vijay");
		v1.add("vij");
		v1.add("ajay");
		v1.add("bhargav");
		v1.add("gokul");
		v2.add("chinni");
		v2.add("santhu");
		v2.add("ajay");
		v2.add("gokul");
		for (int i = 0; i < v1.size(); i++) {
			String k = v1.get(i);
			int count=0;
			for (int j = 0; j < v2.size(); j++) {
				if (k != v2.get(j)) {
					count++;
					if (count == v2.size()) {
						System.out.println(k);
						count = 0;
					}
				}
			}
		}
		for (int i = 0; i < v2.size(); i++) {
			String k = v2.get(i);
			int count=0;
			for (int j = 0; j < v1.size(); j++) {
				if (k != v1.get(j)) {
					count++;
					if (count >= v1.size()) {
						System.out.println(k);
						count = 0;
					}
				}else{
					count = 0;
				}
			}
		}
	}
}
