
import java.util.*;

public class RandomizeNum {
	
	public int[] random(int arrayLength, int maximo) {
		int[] arrayNum = new int[arrayLength];
		
		
		for(int i = 0; i < arrayNum.length; i++){
			int randNum = 1 + (int)(Math.random() * maximo );
			System.out.print("O numero gerado foi : " + randNum + "\n");
						
			while(true){
				if (randNum < 0)
					randNum = randNum * -1;
				if(Arrays.asList(arrayNum).contains(randNum)){
					randNum = 1 + (int)(Math.random() * maximo );
					System.out.print("O numero gerado foi repetido, gerado um novo  : " + randNum + "\n");
				} else{

					arrayNum[i] = randNum;
					System.out.print("O numero foi escrito no Array : " + arrayNum[i] + "\n");
					break;
				}
			}					
		}
		
		return arrayNum;
		
		
	}

}
