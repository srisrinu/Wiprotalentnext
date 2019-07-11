class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	public String getName(String name) {
		return(name);
	}
	public String getEmail(String email) {
		return(email);
	}
	public  char getGender(char gender) {
		return(gender);
	}
	public String toString() {
		return("Author(name="+name+",email="+email+",gender="+gender+")");
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		super();
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
		
	}
	public String getName(String name) {
		return(name);
	}
	public Author getAuthor(Author author) {
		return(author);
	}
	public double getPrice(double price) {
		return(price);
	}
	public int qtyInStock(int qtyInStock) {
		return(qtyInStock);
	}
	public String toString() {
		return("Book(name="+name+",author="+author+",price="+price+",qtyInStock="+qtyInStock+")");
		
	}
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Author a=new Author("Steve pinker","steve123@gmail.com",'M');
       Book b=new Book("Enlightment now",a,1500,150);
       System.out.println(b);
	}

}
