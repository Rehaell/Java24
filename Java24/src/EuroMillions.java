
import java.util.*;


public class EuroMillions {
	
		
	public static void main(String[] args) {
		RandomizeNum arr = new RandomizeNum();
		
		int[] randNum = arr.random(5,50);
	
		int[] randEst = arr.random(2,11);
		
		int[] userNum = { 5, 10, 14, 25, 45 };
		int[] userEst = {8, 11};
		
		
		Arrays.sort(userNum);
		Arrays.sort(userEst);
		
		System.out.println("\nNumeros do jogador");
		for(int i = 0; i < userNum.length; i++)
			System.out.print(userNum[i] + " ");
		
		System.out.println("\nNumeros sorteados");
		for(int i = 0; i < randNum.length; i++){
			System.out.print(randNum[i] + " ");
		}
		
		for(int i = 0; i < userNum.length; i++){
			for(int j = 0; j < userNum.length; j++)
				if(randNum[i] == userNum[j])
					System.out.print("\nAcertou um numero : " + userNum[j]);
		}
		
	}

}
