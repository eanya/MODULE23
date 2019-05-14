package ROUGH_TESTS_july_2017;

import java.util.ArrayList;
import java.util.Hashtable;

public class StoringPeopleInArrayList_James_Goudy1 {

	public static void main(String[] args) {
	 Hashtable<String,String> zpers = new Hashtable<>();
	// person kk = new person();
	 for(int i=0; i<4; i++){
		 person kk = new person();
		String PO=  kk.setFirstName("firstName" + i);
		 kk.setSecondName("secondName" + i);
		// person kk1 = new person();
		// kk1.setFirstName("firstNameX" + i);
		// kk1.setSecondName("secondNameX" + i);
		// zpers.add(kk);
		 zpers.put(kk.setFirstName("firstName" + i),kk.setSecondName("secondName" + i));
		 for(int ik=0; ik<zpers.size(); ik++){
			  System.out.println("printing zpers " + zpers.get(PO));
		  }
	 }
	  for(int t=0; t<zpers.size(); t++){
		  System.out.println("printing zpers " + zpers.get("PO"));
	  }
	  
	 for(String s : zpers.keySet()){
		  System.out.println("printing zpers from keyset "+ zpers.get(s));
	  }
	 
	 
/**	 person Jk = new person();
	 for (int k=0; k<zpers.size(); k=k+1){
		 Jk = zpers.get(k);
		 System.out.println("fullname printed  " + Jk.getFullName());
	 }**/

	}
	
	public static class person{
		
		String firstName;
		String secondName;
		
		public String setFirstName(String firstName){
			return this.firstName=firstName;
		}
		
        public String setSecondName(String secondName){
			return this.secondName=secondName;
		}
		
        public String getFullName(){
			return this.firstName +"  "+ this.secondName;
		}
		
		
	}

}
