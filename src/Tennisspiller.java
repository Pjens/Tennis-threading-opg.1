
public class Tennisspiller extends Thread {

	
	private boolean hardubolden;
	private Tennisspiller modstander;
	private String spiller;
	
	
	public Tennisspiller (String spiller) {
		
		this.spiller = spiller;
		hardubolden = false;		
	}
	
	public void skiftTur () {
		hardubolden = true;
	}
	
	
	
	////------ Start på hjælpemetoder (som sjovt nok ikke er servicemetoder ?)------ ////
	
	public static double sleepInterruptable( double sekunder ) {
	    long start = System.currentTimeMillis();

	    try {
	      Thread.sleep( (long) (sekunder * 1000) );
	    } catch ( InterruptedException e ) {
	      // accept interruption
	    }

	    return ( (double) System.currentTimeMillis() - start ) / 1000;
	  }
	  
	  public static double sleep( double sekunder ) {
	    double delta=0;

	    while ( delta < sekunder )
	      delta += sleepInterruptable( sekunder - delta );
	    
	    return delta;  
	  }
	  
	  public static double nap() {
	    return sleep( 0.1 );
	  }
	  
	  public static double sleepRandom( double sekunder ) {
	    return sleep( sekunder * Math.random() );
	  }
	  
	 ////----- Slut på hjælpemetoder -----////
	  
	 
	  public void setModstander (Tennisspiller modstander) {
		  
		  	this.modstander = modstander;
		  	
	  }
	  
	  public void run() {
		  	while (true) {
		  				  		
		  		if (Math.random() >= 0.20) {
		  			
		  			hardubolden = false;
		  			modstander.skiftTur();
		  			
		  		} else 
		  			System.out.println("" + spiller + " retunerer bolden!");
		  		
		    sleepRandom( 3 );
		    System.out.println( "Elendig kamp....");
		  }
		
	  }
	  
	  
		
	
}
