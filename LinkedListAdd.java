import java.util.LinkedList;


public class LinkedListAdd {


	public static void main(String[] args) {
		
		String res1 = "";
		String res2 = "";
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		LinkedList<Integer> al1 = new LinkedList<Integer>();
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		for (Integer integer : al) {
			res1 += integer+"";
		}
		for (Integer integer : al1) {
			res2 += integer+"";
		}
		int result = Integer.parseInt(res1);
		int result1 = Integer.parseInt(res2);
		System.out.println(result+result1);
	}

}
