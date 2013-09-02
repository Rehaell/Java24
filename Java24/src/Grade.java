
public class Grade {
	public static void main(String[] args) {
		int grade = 15;
		
		if (grade >=1 && grade <10) 
			System.out.println("Não satisfaz");
		else if (grade >= 10 && grade < 13 ) 			
			System.out.println("Satisfaz");
		else if (grade >= 13 && grade < 16 )
			System.out.println("Bom");
		else if (grade >= 16 && grade <= 19 )
			System.out.println("Muito Bom");
		else if (grade == 20)
			System.out.println("Excelente");
		
		switch (grade) {
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: 
			case 8: case 9:
				System.out.println("Não satisfaz");
				break;
			case 10 : case 11: case 12:  		
				System.out.println("Satisfaz");
				break;
			case 13: case 14: case 15:
				System.out.println("Bom");
				break;
			case 16: case 17: case 18: case 19: 
				System.out.println("Muito Bom");
				break;
			case 20 :
				System.out.println("Excelente");
				break;
			default : 
				System.out.println("Sem nota");
		}
	
	}

}
