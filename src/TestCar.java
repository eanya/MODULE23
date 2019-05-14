
public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		//c.start();
		c.stop();
		c.startE();
		c.e.eName="huj";
		
		AudiCar C1 = new AudiCar();
		//C1.start();
		C1.stop();
		C1.openGps();
		C1.startE();
		C1.e.eName="XMachine";
		c.e.eName="huj";
		C1.e.eName="huj";

	}

}
