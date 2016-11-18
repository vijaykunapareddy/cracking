
public class StringReplace {

	public static void main(String[] args) {
		String k = "Mr John Smith     vijay      ";
		char[] stringArray = k.toCharArray();
		String replaceString = "%20";
		int count = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if ((stringArray[i] == ' ')) {
				count++;
			}else{
				count = 0;
			}
		}
		k = k.substring(0, k.length()-count);
		k = k.replaceAll(" ", "%20");
		System.out.println(k);
	}
}
