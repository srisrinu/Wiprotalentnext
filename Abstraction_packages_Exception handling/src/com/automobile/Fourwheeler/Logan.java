package com.automobile.Fourwheeler;


import com.automobile.Vehicle;
public class Logan extends Vehicle{
	protected String ModelName;protected String RegistrationNumber;protected String OwnerName;protected int Speed;protected int gps;
	public Logan(String ModelName,String RegistrationNumber,String OwnerName,int Speed,int gps) {
		super();
		this.ModelName=ModelName;
		this.RegistrationNumber=RegistrationNumber;
		this.OwnerName=OwnerName;
		this.Speed=Speed;
		this.gps=gps;
	}
	@Override
	public  void getModelName() {
	System.out.println("name:"+ModelName);
	}
	@Override
	public  void  getRegistrationNumber(){
 
		System.out.println("RegistrationNumber:"+RegistrationNumber);
	}
	@Override
	public void getOwnerName() {
		System.out.println("OwnerName:"+OwnerName);
	}
	
	public int getSpeed() {
		return(Speed);
	}
	public int gps() {
		return(gps);
	}
}
