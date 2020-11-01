import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class MainClass {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	Vector<VIP> v_vip = new Vector <>();
	
	
	public MainClass() {
		
		boolean validation;
		String name, participant, destination;
		
		do {
			System.out.println("Input name");
			name = sc.nextLine();
			validation = name.contains(" ") &&
					name.indexOf(" ") == name.lastIndexOf(" ");
		}while(validation == false);
		
		do {
			System.out.println("Input dest");
			destination = sc.nextLine();
			validation = name.contains(" ") && name.indexOf(" ") == name.lastIndexOf(" ");
		}while(validation == false);
		
		int random1, random2, random3;
		
		random1 = rand.nextInt(9-0+1)+0;
		random2 = rand.nextInt(9-0+1)+0;
		random3 = rand.nextInt(9-0+1)+0;
		participant = name.substring(0, 1) + destination.substring(0, 1) + "-" + random1 + random2 + random3;
		
		VIP v = new VIP (name, participant, destination);
		v_vip.add(v);
		
		System.out.println("Hasil:");
		
		VIP o = v_vip.get(0);
		System.out.println("Name:" + o.getName());
		System.out.println("Participant: " + o.getParticipant());
		System.out.println("Dest: " + o.getDestination());
		
		v_vip.remove(0);
		
		if(v_vip.isEmpty()) {
			System.out.println("Data hapus");
		}else {
			System.out.println("Selese");
		}
		
	}

	public static void main(String[] args) {
		new MainClass();
	}

}
