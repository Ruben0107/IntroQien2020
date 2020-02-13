import java.util.Random;
 import java.util.Scanner;

 class Blackjack{	
 	public static void main(String[] args) {
 		HetSpel spel = new HetSpel();
 		spel.verkrijgKaarten();
 		spel.speelRonden();
 		System.out.println("Bedankt voor het spelen");
 	}	
 }
 class Kaart{
 	String suit;
 	String value;
 	int waarde;
 }
 class HetSpel{
 	Scanner sc = new Scanner(System.in);
 	Kaart[] deKaarten = new Kaart[52];
 	Random r = new Random();

 	void verkrijgKaarten() {
 		String[] suits = {"Hearts", "Spades", "Diamond","Clubs"};
 		String[] values = {"2", "3", "4","5","6", "7", "8","9","10", "J", "Q","K","A"};
 		int [] waarden = {2,3,4,5,6,7,8,9,10,10,10,10,1};
 		int totaalTeller = 0;
 		for( int x = 0 ; x < suits.length ; x++ ) {
 			for( int y = 0 ; y < values.length ; y++ ) {
 				deKaarten[totaalTeller] = new Kaart();
 				deKaarten[totaalTeller].suit = suits[x];
 				deKaarten[totaalTeller].value = values[y];

 			//	System.out.println( deKaarten[totaalTeller] );
 				totaalTeller++;
 			}
 		}	
 	}
 	void speelRonden(){
 		for(int i = 0; 5<6 ; i++) {
 			System.out.println("Druk k voor nieuwe kaart of q om te stoppen");
 			String invoer = sc.next();
 			if(invoer.equals("q")) {
 				break;
 			}
 			if(invoer.equals("k")) {
 				int uitzoekInt = r.nextInt(52);
 				System.out.println("De kaart die ik krijg is:  "+deKaarten[uitzoekInt]);
 			}
 		}
 	}
 	int bepaalWaarde(String deKaart) {
 		char deLl = deKaart.charAt(deKaart.length()-1);
 		switch(deLl) {
 		case 'Q':
 			return 10;
 		}
 		return -1;
 	}

 }