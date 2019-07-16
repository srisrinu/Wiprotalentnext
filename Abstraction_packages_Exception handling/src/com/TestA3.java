package com;
import com.automobile.twowheeler.*;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
public class TestA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Vehicle v=new Vehicle();
		Hero hero=new Hero("Glamour","AP07BS1693","srinu",120);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		System.out.println(hero.getSpeed());
		Honda honda=new Honda("Shine","Ap07BS1695","prudvi",120);
		//System.out.println(honda.getModelName());
		honda.getModelName();
		honda.getRegistrationNumber();
		honda.getOwnerName();
		System.out.println(hero.getSpeed());
	}

}
