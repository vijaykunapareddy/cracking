import java.util.Scanner;


public class StringReplace {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ...");
		String k = scan.nextLine();
		char[] l = k.toCharArray();
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
	}

}
