package ROUGH_TESTS_july_2017;

import java.util.ArrayList;

public class StoreObjectInArray {
	
	public StoreObjectInArray(){
		System.out.println(" Just Print StoreObjectInArray Constructor");
	}

	public static void main(String[] args) {
		StoreObjectInArray x = new StoreObjectInArray();
		//Person person = new Person();
		
		//Creat Person Object 
		Person person = x.new Person();
		person.setName("Mugu");
	    person.setPNr((long) 234);
	   
	    //Creat ArrayList Object To Add The Person Object 
	    ArrayList<Person> personList = new ArrayList<Person>();
	    personList.add(person);
      
	    // Retrieve The Data From The Person Object 
	   System.out.println("Printing index 1 @ name " + personList.get(0).getName());
	  // System.out.println("Printing index 1 @ name " + personList.get(1).getName());
	   System.out.println("Printing index 1 @ Pnr " + personList.get(0).getPNr());
	  // System.out.println("Printing index 1 @ name " + personList.get(1).getName());
	    for(Person i : personList){
	    	System.out.println("PrintList Print " + i.getName());
	    	System.out.println("PrintList Print " + i.getPNr());	    	
	    }
	}
	public class Person {
		String name;
		Long Pnr;
		
		public Person(){
			System.out.println(" Just Printing Person Constructor");
		}
		
		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name= name;
		}
		
		public Long getPNr(){
			return Pnr;
		}
		
		public void setPNr(Long Pnr){
			this.Pnr = Pnr;
			
		}
			
		
	}
}


