import java.util.Scanner;

public class MultipleInheritance {

	public static void main(String[] args) {
		try {
			String k ="          ";
			for (int i = 1; i <= k.length(); i++) {
				k = changeCharInPosition(i, 'X', k);
				k = changeCharInPosition(k.length()-i, 'X', k);
				System.out.println(k);
				k ="          ";
			}
		} catch (Exception e) {
			System.out.println();
		}
		
	}
	
	public static String changeCharInPosition(int position, char ch, String str){
	    char[] charArray = str.toCharArray();
	    charArray[position] = ch;
	    return new String(charArray);
	}
}
