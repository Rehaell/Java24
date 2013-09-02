public class Div13Arr {

	
	public static void main(String[] args) {
		int[] arraiolos = new int[400];
		int i=0;
		
		for (int dex = 0 ; dex < 400; dex++){
			if (dex % 13 == 0) 
				arraiolos[dex] = dex; 
			
		}

		for (int dex = 0 ; dex < arraiolos.length; dex++)
			if (arraiolos[dex] != 0)
				System.out.print(arraiolos[dex] + " ");
		
	}

}