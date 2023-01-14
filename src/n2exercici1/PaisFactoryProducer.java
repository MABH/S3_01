package n2exercici1;

public class PaisFactoryProducer {
	public static AbstractFactoryAgenda getFactory(String pais) {
        switch (pais) {
	        case ("Alemania"):
	        	System.out.println("PaisFactoryProducer - Alemania");
	        	return new AlemaniaFactory();
	        case ("Brasil"):
				return new BrasilFactory();
	        case ("França"):
				return new FrançaFactory();
	        case ("USA"):
				return new UsaFactory();
	        default: return null;
		}		
    }
}
