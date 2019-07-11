package overriding_or_Polymorphism;

public class Fruit {
	protected String name;
	protected String taste;
	protected int Size;
	public Fruit() {
		name="name of the fruit is";
		taste="taste of the fruit is";
		Size=0;
				
	}
	public void eat() {
		System.out.println(name+" tastes like "+taste);
	}

}
