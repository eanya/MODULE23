package POLYMORPHISM;

public class Lemons {
 //This is About Polymorphic Arrays
	public static void main(String[] args) {		
		Food MonSachi[] = new Food[2];
		MonSachi[0]= new Poppie();
		MonSachi[1]= new Tuna();
		
		for(int x=0; x<MonSachi.length; x++){
			MonSachi[x].eat();
		}

	}

}
