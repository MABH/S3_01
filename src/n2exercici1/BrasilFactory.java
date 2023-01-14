package n2exercici1;

public class BrasilFactory extends AbstractFactoryAgenda{
	public IPais getPais(String pais) {
    	return new DadesBrasil();
    }
}
