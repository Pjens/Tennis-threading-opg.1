
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tennisspiller spiller1 = new Tennisspiller ("Harry Potter");
		Tennisspiller spiller2 = new Tennisspiller ("Snape");
	
		
		spiller1.setModstander(spiller2);
		spiller2.setModstander(spiller1);
		
		
		spiller1.start();
		spiller2.start();
		
		spiller1.skiftTur();
}
}
