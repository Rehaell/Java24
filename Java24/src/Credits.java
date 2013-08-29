
public class Credits {
	public static void main(String[] args) {
		String title = "The Piano";
		int year = 1993;
		String director ="Jane Campion";
		String role1 = "Ada";
		String actor1 = "Holly Hunter";
		String role2 = "Baines";
		String actor2 = "Harvey Keitel";
		
		System.out.println(title + " (" + year + ")\n" + 
				"A " + director + "film.\n\n" + 
				role1 + "\t" + actor1 + "\n" +
				role2 + "\t" + actor2);
		
		System.out.println("\n" + director.toUpperCase());
	}

}
