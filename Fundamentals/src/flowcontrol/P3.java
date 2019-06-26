package flowcontrol;


public class P3{
	public static void main(String []args) {
		int ch=args.length;

		if(ch==0)
			System.out.println("No values");
		else
			for(int i=0;i<ch;i++)
				System.out.print(args[i]+",");
	}
}
