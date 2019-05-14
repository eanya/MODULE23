package POLYMORPHISM;

public class Digest {

	public static void main(String[] args) {
		Food fd = new Tuna();
		digest(fd);

	}
	
	static void digest(Food x){
		x.eat();
	}

}
