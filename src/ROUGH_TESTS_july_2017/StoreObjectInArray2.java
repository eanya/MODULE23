package ROUGH_TESTS_july_2017;

import java.util.ArrayList;
import java.util.Collection;

public class StoreObjectInArray2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		StoreObjectInArray2 x = new StoreObjectInArray2();
		// Creat Person Object
		person p = x.new person();
		p.setName("Mugu");
		p.setPNr((long)234);
		p.setName("Mugu2");
		p.setPNr((long)235);
		p.setName("Mugu3");
		p.setPNr((long)236);
		
		// Create ArrayList Object to Add the Person Object
		//ArrayList<person> Alist =new ArrayList<person>();
		ArrayList<Integer> xKon = new ArrayList<Integer>();
	   //Alist.addAll((Collection<? extends person>) p);
		//Alist.addAll(p);
		//Alist.add(p.setPNr((long)234));

	  // System.out.println("get Alist " + Alist.get(0).getPerson());
	 //  System.out.println("get Alist " + Alist.get(0).getPnr());
		xKon.add(120);
		xKon.add(130);
		xKon.add(1200);
		xKon.add(1240);
	  // for(int i=0; i<Alist.size(); i++){
		for(int i=0; i<xKon.size(); i++){
		  // System.out.println(Alist.size());
		   System.out.println(xKon.size());
		  // System.out.printf(" Alist #%d == %d",i,Alist.get(i));
		   System.out.printf(" XKon #%d == %d\n",i,xKon.get(i));
	   }
		
	  xKon.remove(3);
	   System.out.println("+++++ New List ++++++");
	  for(int i=0; i<xKon.size(); i++){
		  // System.out.println(Alist.size());
		   System.out.println(xKon.size());
		  // System.out.printf(" Alist #%d == %d",i,Alist.get(i));
		   System.out.printf("XKon #%d == %d",i,xKon.get(i));
	   }
	   
	 //  for(person i : Alist){
		 //  System.out.println(i.getPerson());
		  // System.out.println(i.getPnr());
	  // }
	   
	   
	   }
	   // Retrieve Data From Person Object 
	  
	
	
	
	
	public class person{
		
		private String name;
		private Long Pnr;
		public person(String name, Long Pnr){
			this.name=name;
			this.Pnr=Pnr;
			System.out.println(" Printing person constructor");
		}
		
		
		public person(){
			
			System.out.println(" Printing person constructor");
		}
		
		public String getPerson(){
			return this.name;			
		}
		public String setName(String name){
			
			return (this.name=name);
		}
		
		public Long getPnr(){
			return this.Pnr;			
		}
		
	   public Long setPNr(Long Pnr){		   
		return (this.Pnr= Pnr);
	   }
	  // @Override
	   public String toString(){
		  // System.out.println();
		//return String.format("%s\t%f%",this.name,this.Pnr);
		return ("%s\t%f%"+ 	this.name+this.Pnr);
	   }
		
	}

}
