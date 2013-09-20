
import java.util.*;

public class RandomizeNum {
	
	public int[] random(int arrayLength, int maximo) {
		int[] arrayNum = new int[arrayLength];
		boolean numRepetido = false;
		
		//main cycle that runs arrayLength - 1 times
		for(int i = 0; i < arrayNum.length; i++){
			int randNum = 1 + (int)(Math.random() * maximo );
			System.out.print("O numero gerado foi : " + randNum + "\n");
						
			
			while(true){
				//checks if randNum is present on the arrayNum, toggles a flag if so.
				for(int j = 0; j < arrayNum.length ; j++){
					if(arrayNum[j] == randNum){
						numRepetido = true;
						break;
					} else 
						numRepetido = false;
				}
				//if randNum is repeated in the array, randomizes new randNum
				if(numRepetido == true){
					randNum = 1 + 	(int)(Math.random() * maximo );
					System.out.print("O numero gerado foi repetido, gerado um novo  : " + randNum + "\n");
				} else{
					//if not, adds it to the array
					arrayNum[i] = randNum;
					System.out.print("O numero foi escrito no Array : " + arrayNum[i] + "\n");
					break;
				}
			}					
		}
		
		//sorts the final array with no repetitions for nicer look 
		Arrays.sort(arrayNum);
		return arrayNum;
		
		
	}

}
