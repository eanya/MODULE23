package ROUGH_TESTS_july_2017;




public class DemoThread1 {

	public static void main(String[] args) {
		Thread T1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<=10; i++){
					//System.out.println("value of i " + i);
					//i++;
					// i=i+1;
					System.out.println(Thread.currentThread().getId() +"value of i " + i);
				}
				
			}
			
		});
 T1.start();
	}

}
