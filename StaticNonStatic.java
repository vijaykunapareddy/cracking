import java.awt.DisplayMode;


public class StaticNonStatic {

	
	public StaticNonStatic() {
		static int k;
		//illegal modifier static will not be in constructor
		//Stack Over Flow Exception
		StaticNonStatic ss = new StaticNonStatic();
	}	
	
	public static void main(String[] args) {
		
		StaticNonStatic sns = new StaticNonStatic();
		display("vijay------->");
		//compilation error non static field should not call from static
		display1("vijay------->", 1);
	}
	
	public void display1(String msg,int k){
		StaticNonStatic ss = new StaticNonStatic();
		System.out.println(msg);
	}

	public static void display(String msg){
		StaticNonStatic ss = new StaticNonStatic();
		System.out.println(msg);
		ss.display1(msg, 1);
		//Cannot use this in a static context
		System.out.println(this.msg);
		System.out.println(super.msg);
	}
}
