
public class Car {
	
	String Name;
	Engine e;
	
	public Car(){
		e = new Engine();
	String eName= e.eName="fxSys";
		System.out.println("Car Constructor & Printing eName " );//+ eName
	}
	
	
	/***public void start(){
	e = new Engine();
		//e.startUp();
	e.eName="fxSys";
	System.out.println("Car Starting");
	}***/
	
	public Engine startE(){
		e = new Engine();
			//e.startUp();
		e.eName="fxSys";
		System.out.println("Car Starting " + e.eName);
		return e;
		}
	public void stop(){
	System.out.println("Car Stopping");
	}

}
