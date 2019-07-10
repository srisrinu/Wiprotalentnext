class Box{
	double width,height,depth;
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double Volume() {
		return(width*height*depth);
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box b1=new Box(100,100,100);
     double v1=b1.Volume();
     System.out.println(v1);
     
	}

}
