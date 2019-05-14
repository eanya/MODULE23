package SuperConstructor1;

public class Subclass extends Superclass {
	
	int a;
	int b;
	
	public Subclass(int a, int b){
		super();
		this.a=a;
		this.b=b;		
	}
	public static void main(String[] args) {
		Subclass subc = new Subclass(4,5);
		System.out.println("Print superclass 1 "+subc.c);
		System.out.println("Print superclass 2 "+subc.d);
		System.out.println("Print superclass 3 "+subc.a);
		System.out.println("Print superclass 4 "+subc.b);

	}

}
