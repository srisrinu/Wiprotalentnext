package Assignment3;
import java.util.Random;
public class TestInstruments {
	public static void main(String []args) {
		Instrument instrument[]=new Instrument[10];
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			int randnum=rand.nextInt((3 - 1) + 1) + 1;
			if(randnum==1) {
				instrument[i]=new Piano();
			}
			else if(randnum==2) {
				instrument[i]=new Flute();
			}
			else if(randnum==3) {
				instrument[i]=new Guitar();
			}
			System.out.println(instrument[i].play());
		}
		for(int i=0;i<10;i++) {
			if(instrument[i] instanceof Piano) {
				System.out.println("Piano is stored at index "+i);
			}
			else if(instrument[i] instanceof Flute) {
				System.out.println("Flute is stored at index "+i);
			}
			else if(instrument[i] instanceof Guitar) {
				System.out.println("Guitar is stored at index "+i);
			}
		}
	}

}
