package ROUGH_TESTS_july_2017;


class ThreadTest extends Thread{
	DemoThread tdemo;
	
	public ThreadTest(DemoThread tdemo){
		this.tdemo= tdemo;
		start();
	}
	

	//public void run() {
		//for(int i=0; i<=10; i++){
			//System.out.println("value of i " + i);
			//i++;
			// i=i+1;
			//System.out.println(Thread.currentThread().getId() +"value of i " + i);
		//}
	//}
	
	public void run() {
		tdemo.test();
		//start();
		
	}
	
	
}

public class DemoThread {
	
	public synchronized void test(){
		for(int i=0; i<10; i++){
			System.out.println(" Printing i " + i);	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		DemoThread DT = new DemoThread();
		new ThreadTest(DT);
		new ThreadTest(DT);
		//ThreadTest TT = new ThreadTest();
		//TT.start();
		//ThreadTest TT1 = new ThreadTest();
		//TT1.start();
	}

}
