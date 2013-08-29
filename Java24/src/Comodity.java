
public class Comodity {
	public static void main(String[] args) {
		String command = "SELL";
		int balance = 550;
		int quantity = 42;
		String gender = "MALE";
		
		switch (command){
			case "BUY":
				quantity += 5;
				balance -= 20;
				break;
			case "SELL":
				quantity -=5;
				balance +=15;
		}
		System.out.println("Balance : " + balance + "\n"
				+ "Quantity : " + quantity + "\n" 
				+ (gender.equals("MALE")? "Mr." : "Ms."));

	}

}
