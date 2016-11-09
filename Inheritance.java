class BaseClass{
	private int x;
	public int getValue1(){
		return x;
	}
	public BaseClass(int x) {
		this.x = x;
		System.out.println("--private"+this.x);
	}
}

class DerivedClass extends BaseClass{
	public DerivedClass(int x) {
		super(x);
		System.out.println(x);
	}

	public int getValue(){
		return getValue1();
	}
}

public class Inheritance {

	public static void main(String[] args) {
		DerivedClass D = new DerivedClass(10);
		//System.out.println(D.getValue());
	}

}
