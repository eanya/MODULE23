package COMS.THREADS.DEMO;

class SOP{
	public static void print(String names){
		System.out.println(names + "\n");
	}
	
}


class TestThread extends Thread{
	String name;
	ThreadDemo theDemo1;
	
	public TestThread(String name,ThreadDemo theDemox){
		this.name=name;
		this.theDemo1=theDemox;
		start();
	}
	
	@Override
	public void run() {
		theDemo1.test(name);
	}
	
	
	
}

public class ThreadDemo {
	
	public synchronized void test(String name) {
		for(int i=0; i<10; i++){
			SOP.print(name + "::" + i);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
//whether it is Mickey Mouse movement
//Some People Are not Really Working With Logic ..
// Fuck It -Am a Team Player -
	public static void main(String[] args) {
		ThreadDemo tyd = new ThreadDemo();
		new TestThread("Gogo 1",tyd );
		new TestThread("Gogo 2",tyd );
		new TestThread("Gogo 3",tyd );

	}

}
