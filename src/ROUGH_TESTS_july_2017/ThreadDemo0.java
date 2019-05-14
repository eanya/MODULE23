package ROUGH_TESTS_july_2017;

class Demo0 implements Runnable{

	@Override
	public void run() {
		printNumbs();
		
		//for(int i=0; i<=10; i++){
		//System.out.println("value of i " + i);
			//i++;
			// i=i+1;
		//	System.out.println(Thread.currentThread().getId() +"value of i " + i);
		//}
	}
	
	public synchronized void printNumbs(){
		for(int i=0; i<=10; i++){
			//System.out.println("value of i " + i);
			//i++;
			// i=i+1;
			System.out.println(Thread.currentThread().getId() +" value of i " + i +"\n");
			//mySOP(Thread.currentThread().getId() + "  value of i " + i);
		}
		//System.out.println(Thread.currentThread().getId() +"value of i " + i);
	}
	
	public void mySOP(String name){
		System.out.println(name+"\n");
		
	}
	
}

public class ThreadDemo0 {

	public static void main(String[] args) {
		Thread d0 = new Thread(new Demo0());
		d0.start();
        Thread d1 = new Thread(new Demo0());
		d1.start();
		  

	}

}
