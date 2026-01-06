package list;

public class Train {
	int number;
	String name;
	String source;
	String destination;
	
	
	public Train(int number, String name, String source, String destination) {
		super();
		this.number = number;
		this.name = name;
		this.source = source;
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Train [number=" + number + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ "]";
	}

}
