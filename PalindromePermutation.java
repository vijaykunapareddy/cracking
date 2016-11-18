
public class PalindromePermutation {

	public static void main(String[] args) {

		String value1 = "Pale";
		String value2 = "Bale";
		int count = 0;
		int len1 = value1.length();
		int len2 = value2.length();
		int k = Math.abs(len1-len2);
		if ( k <= 1) {
			for (int i = 0;i < value1.length();i++) {
				if (value1.charAt(i) == value2.charAt(i)) {
					if ((count == 1)&&(k>0)) {
						System.out.println("Contains more than one change");
						System.exit(0);
					}
				}else {
					count++;
					if ((count == 1)&&(k>0)) {
						System.out.println("Contains more than one change");
						System.exit(0);
					}
				}
			}
			if ((count > 1)) {
				System.out.println("Contains more than one change");
			}else{
				System.out.println("It contains one change");
			}
			
		} else {
			System.out.println("Contains more than one change");
		}
	}
}
