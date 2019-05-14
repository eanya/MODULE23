package SUPER_KEYWORD_METHODSNCONSTRUCTORS;

public class Superkeyword2 extends Superkeyword1{
	
	public void printsomething(){
		super.printsomething();
		System.out.println("Printing from Superkeyword2");
	}

	public static void main(String[] args) {
		Superkeyword2 spk = new Superkeyword2();
		spk.printsomething();

	}

}
