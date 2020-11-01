
public class VIP extends Customer {

	public VIP(String name, String participant, String destination) {
		super(name, participant, destination);
	}

	@Override
	public void test() {
		System.out.println("Ini test jalan ye, thx");
	}

}
