package com.Interface.assignment1Interface;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AdultUsers adult =new AdultUsers(20,"Fiction");
      adult.registerAccount();
      adult.requestBook();
      KidUsers kid=new KidUsers(13,"Kids");
      kid.registerAccount();
      kid.requestBook();
	}

}
