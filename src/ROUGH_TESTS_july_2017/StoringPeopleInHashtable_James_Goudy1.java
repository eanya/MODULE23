package ROUGH_TESTS_july_2017;

import java.util.ArrayList;

public class StoringPeopleInHashtable_James_Goudy1 {

	public static void main(String[] args) {
	 ArrayList<person> zpers = new ArrayList<person>();
	// person kk = new person();
	 for(int i=0; i<4; i++){
		 person kk = new person();
		 kk.setFirstName("firstName" + i);
		 kk.setSecondName("secondName" + i);
		 zpers.add(kk);
	 }
	 
	 person Jk = new person();
	 for (int k=0; k<zpers.size(); k=k+1){
		 Jk = zpers.get(k);
		 System.out.println("fullname printed  " + Jk.getFullName());
	 }

	}
	
	public static class person{
		
		String firstName;
		String secondName;
		
		public void setFirstName(String firstName){
			this.firstName=firstName;
		}
		
        public void setSecondName(String secondName){
			this.secondName=secondName;
		}
		
        public String getFullName(){
			return this.firstName +"  "+ this.secondName;
		}
		
		
	}

}
