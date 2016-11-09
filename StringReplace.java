
public class StringReplace {

	public static void main(String[] args) {
		String k = "Mr John Smith     ";
		String k1 = "";
		System.out.println(k.length());
		char[] kk = k.toCharArray();
		System.out.println(kk.length);
		int count =0;
		for (char c : kk) {
			if (c == ' ') {
				count++;
				System.out.println(count);
				if (count == 1) {
					k1 +=  "%20";
				}
			}else{
				count = 0;
				k1 += c;
			}
		}
		
		int l = k1.length();
		if (k1.endsWith("%20")){
			k1 = k1.substring(0, l-3);
			System.out.println(k1);
		}else{
			System.out.println(k1);
		}
	}
}
