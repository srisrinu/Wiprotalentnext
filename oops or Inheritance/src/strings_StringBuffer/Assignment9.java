package strings_StringBuffer;
import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String big=s1.length()>s2.length()?s1:s2;
		String small=s1.length()<s2.length()?s1:s2;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			sb.append(s1.charAt(i)).append(s2.charAt(i));
		}
		sb.append(big.substring(small.length(),big.length()));
		System.out.println(sb);
	}

}

