
import java.util.*;

public class RandomizeNum {
	
	public int[] random(int arrayLength, int maximo) {
		int[] arrayNum = new int[arrayLength];
		boolean numRepetido = false;
		
		
		for(int i = 0; i < arrayNum.length; i++){
			int randNum = 1 + (int)(Math.random() * maximo );
			System.out.print("O numero gerado foi : " + randNum + "\n");
						
			while(true){
				if (randNum < 0)
					randNum = randNum * -1;
				for(int j = 0; j < arrayNum.length ; j++){
					if(arrayNum[j] == randNum){
						numRepetido = true;
						break;
					} else 
						numRepetido = false;
				}
				if(numRepetido == true){
					randNum = 1 + 	(int)(Math.random() * maximo );
					System.out.print("O numero gerado foi repetido, gerado um novo  : " + randNum + "\n");
				} else{
					arrayNum[i] = randNum;
					System.out.print("O numero foi escrito no Array : " + arrayNum[i] + "\n");
					break;
				}
			}					
		}
		Arrays.sort(arrayNum);
		return arrayNum;
		
		
	}

}
