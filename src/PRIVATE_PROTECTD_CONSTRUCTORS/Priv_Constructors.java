package PRIVATE_PROTECTD_CONSTRUCTORS;

public class Priv_Constructors {
	
 	static Priv_Constructors pc;
	
	private Priv_Constructors(){
		System.out.println("Priv_Constructors");
	}
	
	public static Priv_Constructors getInstance(){
		
		if(pc==null){
			pc = new Priv_Constructors();
		}
		
		return pc;
		
	}
	
	public void Priv_ConstructorsTest(){
		System.out.println("Priv_ConstructorsTEST");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Priv_Constructors kl = new Priv_Constructors();
	}

}
