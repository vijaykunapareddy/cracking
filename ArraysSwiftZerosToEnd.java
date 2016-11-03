import java.util.ArrayList;


public class ArraysSwiftZerosToEnd {

	public static void main(String[] args) {
		
		int[] data = {10,20,0,40,0,60,0,0,90,91};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i]!=0) {
				al.add(data[i]);
			}else{
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			al.add(0);			
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}
	}

}
