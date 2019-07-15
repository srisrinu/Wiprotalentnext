package Assignment2;
import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Compartment []compartment=new Compartment[10];
     Random rand=new Random();
     for(int i=0;i<10;i++) {
    	 
     
    int randnum= rand.nextInt(4 - 1 + 1) + 1;
    if(randnum==1) {
    	compartment[i]=new FirstClass();
    	
    }
    else if(randnum==2) {
    	compartment[i]=new Ladies();
    }
    else if(randnum==3) {
    	compartment[i]=new General();
    }
    else if(randnum==4) {
    	compartment[i] = new Luggage();
    }
    	
    
     System.out.println(compartment[i].notice());
	}

}
}
