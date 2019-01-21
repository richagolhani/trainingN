package com.learn2drive.model;

public class SUV extends Car {

	private boolean fourWheelDrive;
	
	public SUV(){
		this("Ssanyong","Rexton","red",true);
	}
	public SUV(String make,String model,String color,boolean fourWheelDrive){
		super(make,model,color);
		this.fourWheelDrive=fourWheelDrive;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	@Override
	public String toString(){
		return super.toString()+"- "+isFourWheelDrive();
	}
	/*public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
		
	}*/
	
}
