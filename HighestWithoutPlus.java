
public class HighestWithoutPlus {

	
	public static void main(String[] args) {
		int x = 50;
		int y = -10;
		double result;
		try{
			int l = x + Math.abs(x);
			int m = y + Math.abs(y);
			result = l/m;
			System.out.println(result);
			int k = (int) result;
			int h = x/k;
			System.out.println("Biggest number is "+x);
			System.out.println("Smallest number is "+y);
		}catch(ArithmeticException e) {
			System.out.println("Smallest number is "+x);
			System.out.println("Biggest number is "+y);
		}
	}
}
