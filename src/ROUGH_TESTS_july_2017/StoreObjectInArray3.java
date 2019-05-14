package ROUGH_TESTS_july_2017;

import java.util.ArrayList;

public class StoreObjectInArray3 {

	public static void main(String[] args) {
		//StoreObjectInArray3 x = new StoreObjectInArray3();
		ArrayList<person> xper = new ArrayList<person>();		
		xper.add( new person("emmsino1",(long) 234));
		xper.add( new person("emmsino2",(long) 235));
		xper.add( new person("emmsino3",(long) 236));
		xper.add( new person("SALLY",(long) 8878));
		person.printPerson(xper);
		person tmp;
		tmp = new person("SALLYXXX",(long) 8878);
		//tmp = xper.remove(0);
		person.printPerson(xper);
		//xper.add(tmp);
		person.printPerson(xper);
		xper.add( new person("BOB",(long) 6660));
		person.printPerson(xper);
		//Swap Sally And Bob
		//tmp = xper.get(3); //put sally into tmp
		xper.set(3,xper.get(4) );
		xper.set(4,tmp);
		 
		person.printPerson(xper);
		
	//xper.set(index, element)
		/***	System.out.printf("Name\t       Pnr\n");
			for(person s : xper){
				System.out.println(s);
				//System.out.printf("Print person: %s\n", s);
				//s.println();
			}
	***/	
	}
	
public static class person{
	String name;
	Long Pnr;
	
	public person(String name, Long Pnr){
		this.name=name;
		this.Pnr=Pnr;
	}
	
	public person(){
		
	}
	//@Override
	public String toString(){		
		return String.format(" XfD %s\t%d\n", this.name,this.Pnr);		
	}
	public String getName(){
		return name;
	}
	public Long getPnr(){
		return Pnr;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setPnr(Long Pnr){
		this.Pnr=Pnr;
	}
	
	public static  void printPerson(ArrayList<person> a){
		System.out.printf("  name \t  pnr\n");
		for(person s : a){
			System.out.println(s);
		}
		
	}
	
}

}
