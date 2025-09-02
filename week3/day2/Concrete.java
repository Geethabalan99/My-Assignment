package week3.day2;

public class Concrete implements DatabseConnection {

	@Override
	public void connect() {
		System.out.println("Connect the Wifi");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnet the hotspot");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updates are executed");
		
	}
	public static void main(String[] args) {
		Concrete Con=new Concrete();
		Con.connect();
		Con.disconnect();
		Con.executeUpdate();
	}

}
