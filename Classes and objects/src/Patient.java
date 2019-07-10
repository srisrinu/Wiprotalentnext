class P3{
	String name;
	double height;
	double weight;
	P3(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	double computeBMi() {
		return((weight/(height*height))*703);
	}
}
public class Patient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     P3 p=new P3("srinivas",155, 67.5);
     //double BMI=p.computeBMi();
     System.out.println(p.computeBMi());
	}

}
