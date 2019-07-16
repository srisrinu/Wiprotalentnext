package com.Interface.assignment1Interface;

public class AdultUsers implements LibraryUser {
 protected int age;protected String bookType;
 public AdultUsers(int age,String bookType) {
	 this.age=age;
	 this.bookType=bookType;
 }
 /*public void  SetAge(int age) {
	 this.age=age;
 }*/
/* public void SetbookType(String bookType) {
	 this.bookType=bookType;
 }*/
 @Override
 public void registerAccount() {
	 if(age>12) {
		 System.out.println("You have successfully registered under an Adult Account");
	 }
	 else if(age<=12){
		 System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	 }
 }
 @Override
 public void requestBook() {
	 if(bookType.equalsIgnoreCase("Fiction")) {
		 System.out.println("Book Issued successfully, please return the book within 7 days");
	 }
	 else {
		 System.out.println("Oops, you are allowed to take only adult Fiction books");
	 }
 }
 
}
