import java.util.Scanner;
import java.util.Random;

public class Mastermind {
	
	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");
		Mastermind.welkomsBericht();
		Spel spel = new Spel();
		
		
		
				
}private static void welkomsBericht() {
	System.out.println("Welkom bij mastermind!");
	System.out.println("Het spel werkt als volgt, de computer genereert een random code");
	System.out.println("van vier cijfers uit een reeks van zes cijfers.");
	System.out.println("Jij moet de code binnen twaalf beurten raden. Succes!");
		
	}//endofwelkomsBericht


	

	
}//endofMastermind

class Spel {
	int computerCode;
	int[] codeOpties = {1,2,3,4,5,6};{
	
	for (int x=1;x<=4;x++) {
	Random rand = new Random();{

	computerCode = codeOpties [rand.nextInt(codeOpties.length)];
	
	//System.out.println(computerCode);
	}
}
	
	
	for(int i=1;i<=12;i++){  
	
	 
		Scanner inputSpeler = new Scanner(System.in);
		System.out.println("Vul hier je antwoord in:");
		

		int codeSpeler = inputSpeler.nextInt(); 
		System.out.println("Jouw antwoord: " + codeSpeler);
    
		System.out.println(/*computerCode + " " +*/ codeSpeler);
	
			if (computerCode == codeSpeler && i<= 12) {
    		System.out.println("Goed geraden je hebt gewonnen");
    			break;
			}else{ System.out.println("Verkeerd geraden"); }//endofelse
		}//endofforloop
	}
}//endofclassSpel







		
		// TODO code van 1 genereren uit BAK van zes
		// String array 6 karakters
		// Random range 0-5 & uitprinten
		// TODO input speler 1 karakter
		// scanner importeren
		// Speler vragen om input
		// TODO print ze allebei op het scherm
		// TODO GOOGLEN hoe je ze vergelijk, de karakters
		// check of dat ja of nee is
		// TODO punt geven als gelijk
		// TODO geen punt als i goed
		//=================
		// nu proberen met twee karakters computer code
		// met if statement & for loop	


