package STATIC_OVERIDE_TEST;

public class Bclass extends Aclass {
	
	 
	public static void a() { 
	//public  void b() {
	        System.out.println("B.a()");
	    }
	
	public void BK() { 
	//public  void b() {
	        System.out.println("B.a()");
	    }
	@Override
	public void ad_nonstatic() { 
		 System.out.println("B.d()");
			    }
	 public static void main(String[] args){
		 
		 Aclass a = new Aclass();
		 a.a();
		//ref of parent class = obj of child class 
		 // All functions of parent class 
		 // All overridden functions of child class
		 Aclass a1 = new Bclass();
		 a1.a();
		 
		 a1.ad_nonstatic();
		 a1.ad_nonstatic();
		 Bclass b = new Bclass();
		 b.a();
		 b.ad_nonstatic();
		 
			
		}


}
