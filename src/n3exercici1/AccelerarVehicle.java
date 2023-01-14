package n3exercici1;

public class AccelerarVehicle implements Command{
	private Actions actions;
	
	public AccelerarVehicle (Actions actions) {
		this.actions = actions;
	}

	@Override
	public void execute(String vehicle) {
		actions.accelerar(vehicle);		
	}
}
