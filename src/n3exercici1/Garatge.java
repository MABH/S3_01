package n3exercici1;

import java.util.ArrayList;

public class Garatge {
	 private ArrayList<Command> commandList = new ArrayList<Command>(); 

	   public void setCommand(Command command){
		   commandList.add(command);		
	   }

	   public void executeCommandList(String vehicle){
	      commandList.forEach((command) -> command.execute(vehicle));
	   }
	   public void eraseCommandList(){
		  commandList.clear();
	   }
}
