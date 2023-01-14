package n2exercici1;

public class AlemaniaFactory extends AbstractFactoryAgenda{

	@Override
	public IPais getPais(String pais) {
		return new DadesAlemania();	}
	
}
