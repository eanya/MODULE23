package com.ABSTRACT.DEMO.MODULE4PART2;

public abstract class TownHospital implements Hospital{

	@Override
	public void operateBody() {
		System.out.println("Operate Body Dept");
		
	}

	@Override
	public void scanBody() {
		System.out.println("Scan Body Dept");
		
	}

	@Override
	public void emergencyDept() {
		System.out.println("Emergency Dept");
		
	}

	 
}
