

public class test {
	public static void main(Strings[] args) {
		cableModem surfBoard = new cableModem();
		DslModem gateway = new DslModem();
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		System.out.println("Trying the cable modem");
		surfBoard.displaySpeed();
		surfBoard.connect();
		System.out.println("Trying the DSL modem	");
		gateway.displaySpeed();
		gateway.connect();
	}
}
