
public class cableModem extends Modem {
	String method = "cable connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet...");
		System.out.println("Using a " + method);
	}
}
