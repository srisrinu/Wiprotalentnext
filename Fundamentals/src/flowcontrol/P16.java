package flowcontrol;

import java.util.Scanner;
public class  P16{
    public static void main(String[] args) {
      int k=1,n;
      Scanner Sc=new Scanner(System.in);
      n=Sc.nextInt();
      for(int i=0;i<n;i++) {
        for(int j=0;j<=i;j++) {
          System.out.print("*"+" ");
          //k+=1;
        }
        System.out.println();
      }

    }
}