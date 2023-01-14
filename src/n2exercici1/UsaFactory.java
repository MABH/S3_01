package n2exercici1;

public class UsaFactory extends AbstractFactoryAgenda{

	@Override
	public IPais getPais(String pais) {
		
		return new DadesUSA();
	}
}
