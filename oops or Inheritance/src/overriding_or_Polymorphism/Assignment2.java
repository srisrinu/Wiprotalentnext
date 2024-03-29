package overriding_or_Polymorphism;
class Shape{
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing triangle");
	}
	@Override
	public void erase() {
		System.out.println("Erasing triangle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}
}
public class Assignment2 {
    public static void main(String []args) {
    	Shape c=new Circle();
    	Shape t=new Triangle();
    	Shape s=new Square();
    	c.draw();
    	c.erase();
    	t.draw();
    	t.erase();
    	s.draw();
    	s.erase();
    }
}
