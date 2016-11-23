
public class StringCount {


	public static void main(String[] args) {

		String k = "";
		String v ="";
		int count=0;
		char temp = 0;
		for (int i = 0; i < k.length(); i++) {
			if ((temp == k.charAt(i))||(count==0)) {
				count++;
				temp = k.charAt(i);
				if (i == k.length()-1) {
					v = v.concat(""+temp+count);
				}
			}else{
				v = v.concat(""+temp+count);
				temp = k.charAt(i);
				count = 1;
				if (i == k.length()-1) {
					v = v.concat(""+temp+count);
				}
			}
		}
		System.out.println(v);
	}	
}
