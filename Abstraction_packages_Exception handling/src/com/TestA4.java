package com;

import  com.automobile.Fourwheeler.Logan;
import  com.automobile.Fourwheeler.Ford;
//import com.automobile.twowheeler.*;
//import com.automobile.twowheeler.Hero;
//import com.automobile.twowheeler.Honda;
public class TestA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Vehicle v=new Vehicle();
		Logan logan=new Logan("Renault","AP07BS1693","srinu",408,11);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		System.out.println(logan.getSpeed());
		System.out.println(logan.gps());
		Ford ford=new Ford("EcoSport","Ap07BS1695","prudvi",408,25);
		//System.out.println(honda.getModelName());
		ford.getModelName();
		ford.getRegistrationNumber();
		ford.getOwnerName();
		System.out.println(ford.getSpeed());
		System.out.println(ford.tempControl());
	}

}
