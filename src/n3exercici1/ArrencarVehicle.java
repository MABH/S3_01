package n3exercici1;

public class ArrencarVehicle implements Command{
	private Actions actions;
	
	public ArrencarVehicle (Actions actions) {
		this.actions = actions;
	}

	@Override
	public void execute(String vehicle) {
		actions.arrencar(vehicle);				
	}		
}
