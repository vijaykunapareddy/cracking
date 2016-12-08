
public class BinarySearchTree {

	public static void main(String[] args) {
		
		int[] k = {1,2,3,0,5,6,10,40,78,3420,};
		int x = 78;
		binarySearch(k, 0, k.length-1, x);
	}

	private static void binarySearch(int[] k, int low, int high, int x) {
		
		int mid = low+(high-low)/2;
		if (high>=low) {
			if (k[mid] == x) {
				System.out.println(mid);
			}else if(x < k[mid]){
				binarySearch(k, low, mid-1, x);
			}else{
				binarySearch(k, mid+1, k.length-1, x);
			}
		}
	}
}
