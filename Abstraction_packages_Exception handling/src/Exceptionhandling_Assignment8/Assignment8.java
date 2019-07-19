package Exceptionhandling_Assignment8;

import Exceptionhandling_Assignment8.InvalidAgeException;

public class Assignment8 {

	public static void main(String[] args) throws InvalidAgeException{
		// TODO Auto-generated method stub
      String name=args[0];
      int age=Integer.parseInt(args[1]);
      if(age<18||age>=60)
    	  throw new InvalidAgeException();
      System.out.println("name:"+name +" age:"+age);
	}

}
