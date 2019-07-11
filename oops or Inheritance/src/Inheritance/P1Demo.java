package Inheritance;
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}
class Bird extends Animal{
	@Override
	void eat() {
		System.out.println("Bird is eating");
	}
	@Override
	void sleep() {
		System.out.println("Bird is sleeping");
	}
	void fly() {
		System.out.println("Bird is flying");
	}
}
public class P1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal a=new Animal();
      Bird b=new Bird();
      a.eat();
      a.sleep();
      b.eat();
      b.sleep();
      b.fly();
	}

}
