package Exe3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boat dinghy = new Boat();
			System.out.println("Type\t\t: "+ dinghy.type);//Dinghy Boats
			System.out.println("Size\t\t: "+ dinghy.size);//Small
			System.out.println("Brand\t\t: "+ dinghy.brand);//Zodiac
			System.out.println("Application\t: This kind of boat "+ dinghy.application + ".");//provide as a companion boats for larger vessels
			System.out.println("Starting price\t: RM"+ dinghy.price +"(around)");//6000
		
			System.out.println();
		
		Boat deck = new Boat();
		
			System.out.println("Type\t\t: "+ deck.type);//Deck Boats
			System.out.println("Size\t\t: "+ deck.size);//Medium
			System.out.println("Brand\t\t: "+ deck.brand);//Glastron
			System.out.println("Application\t: This kind of boat "+ deck.application + ".");//provide function such as skiing, tubing and wakeboarding
			System.out.println("Starting price\t: RM"+ deck.price +"(around)");//50000
		
			System.out.println();
		
		Boat trawler = new Boat("Trawler boats", "Medium", "Beneteau", "provide boating fun on the water such as living aboard for significant stretches of time", 80000);
			System.out.println("Type\t\t: "+ trawler.type);
			System.out.println("Size\t\t: "+ trawler.size);
			System.out.println("Brand\t\t: "+ trawler.brand);
			System.out.println("Application\t: This kind of boat "+ trawler.application + ".");
			System.out.println("Starting price\t: RM"+ trawler.price +"(around)");
		
			System.out.println();
		
		Boat cruiser = new Boat("Power Cruiser", "Big", "Afina", "provide as an ideal option in feeling the sun above and the ocean below", 300000);
			System.out.println("Type\t\t: "+ cruiser.type);
			System.out.println("Size\t\t: "+ cruiser.size);
			System.out.println("Brand\t\t: "+ cruiser.brand);
			System.out.println("Application\t: This kind of boat "+ cruiser.application + ".");
			System.out.println("Starting price\t: RM"+ cruiser.price +"(around)");
	}

}
