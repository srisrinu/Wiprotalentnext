package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda  extends Vehicle{
	protected String ModelName;protected String RegistrationNumber;protected String OwnerName;protected int Speed;
	public Honda(String ModelName,String RegistrationNumber,String OwnerName,int Speed) {
		super();
		this.ModelName=ModelName;
		this.RegistrationNumber=RegistrationNumber;
		this.OwnerName=OwnerName;
		this.Speed=Speed;
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
	public void cdplayer() {
		System.out.println("Accessing the radio");
	}
}
