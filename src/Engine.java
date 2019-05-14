
public class Engine {
	
	String eName;
	
	public Engine(){
		System.out.println("Printing FROM Engine COnstructor");
	}
	public void startUp(){
		//The relationship is that a Car Has And Engine- This brings the concept of Aggregation
		// We mean 1 Object Inside Another Object 
		System.out.println("starting Engine");
	}

}
