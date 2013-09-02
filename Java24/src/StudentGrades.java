
public class StudentGrades {
	public static void main(String[] args) {
			int[][] studentGrades = new int[20][1];
			float media = 0;
			
			for (int dex = 1 ; dex <= studentGrades.length; dex++){
				int nota = 0 + (int)(Math.random()*20); 
				studentGrades[dex-1][0] = nota;
				media += nota;
			}
			media = media/studentGrades.length;
			
			for (int dex = 1 ; dex <= studentGrades.length; dex++){
				System.out.println("Aluno n.º "+dex+ " : nota - "+studentGrades[dex-1][0]);
			}
			System.out.println("Média final da turma : " + media);

	}

}
