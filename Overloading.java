class Base{
	
	public void call(int k){
		
		System.out.println("base ");
	}
}
class Derived extends Base{
	
	public void call(int k){
		System.out.println("child ");
	}
}
public class Overloading {

	public static void main(String[] args) {
		
		Derived b = (Derived) new Base();
		b.call(2);

	}

}
