import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class MainClass {

	Scanner sc = new Scanner(System.in);
	Vector<Racer> v_racers = new Vector<>();
	Random rand = new Random();
	
	public MainClass() {
		
		int choice;
		
		do {
			System.out.println("Menu");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				choice = 0;
			}
			sc.nextLine();
			
			switch(choice) {
				case 1:
					add();
				break;
			}
		}while(choice != 4);
		
	}
		
	private void add() {
			
		String horseName, racerName;
		//boolean validation;
		
		//do {
			System.out.println("Input racer name: ");
			racerName = sc.nextLine();
			horseName = sc.nextLine();
		//}while(validation == false);
		
		Racer r = new Racer(racerName, horseName);
		v_racers.add(r);
		char angka = (char) (rand.nextInt('Z' - 'A' + 1) + 'A');
		}

	public static void main(String[] args) {
		new MainClass();
	}

}
