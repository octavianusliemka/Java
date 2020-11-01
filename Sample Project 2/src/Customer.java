
public abstract class Customer {

	private String name, participant, destination;

	public Customer(String name, String participant, String destination) {
		super();
		this.name = name;
		this.participant = participant;
		this.destination = destination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParticipant() {
		return participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public abstract void test();
	
}
