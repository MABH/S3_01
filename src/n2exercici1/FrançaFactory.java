package n2exercici1;

public class FrançaFactory extends AbstractFactoryAgenda{
	public IPais getPais(String pais) {
    	return new DadesFrança();
    }
}
