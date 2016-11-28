import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;


public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll.add(3);
		ll.add(5);
		ll.add(8);
		ll.add(5);
		ll.add(10);
		ll.add(2);
		ll.add(1);
		int k = 5-2;
		int index =0;
		for (int i = 0; i < ll.size(); i++) {
			if (k == i) {
				index = ll.get(i) ;
				//System.out.println(index);
			}
		}
		System.out.println();
		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i)<index) {
				//System.out.println(ll.get(i));
				ll1.add(ll.get(i));
			}else{
				//System.out.println(ll.get(i));
				ll2.add(ll.get(i));
			}
		}
		//ll1.add(index);
		ll1.addAll(ll2);
		for (int i = 0; i < ll1.size(); i++) {
			System.out.println(ll1.get(i));
		}
	}
}
