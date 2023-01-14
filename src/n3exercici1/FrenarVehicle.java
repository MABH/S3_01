package n3exercici1;

public class FrenarVehicle implements Command{
	private Actions actions;
	
	public FrenarVehicle (Actions actions) {
		this.actions = actions;
	}

	@Override
	public void execute(String vehicle) {
		actions.frenar(vehicle);
	}
	
}
