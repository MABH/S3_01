package n3exercici1;

import java.util.Scanner;

public class n3exercici1 {
	static Garatge garatge = new Garatge();
	public static void main(String[] args) {
		menuGaratge();
	}
	
	public static void menuGaratge() {		
		char option;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\nGaratge");
			System.out.println("Agafar vehicle");
			System.out.println("A - Avió");
			System.out.println("B - Bicicleta");
			System.out.println("C - Cotxe");
			System.out.println("V - Vaixell\n");
			System.out.println("S - Sortir");
			option = sc.nextLine().charAt(0);
			switch (option) {
				case 'A':
				case 'a':
					doAction("Avio");
					break;			
				case 'B':
				case 'b':
					doAction("Bicicleta");
					break;
				case 'C':
				case 'c':
					doAction("Cotxe");
					break;
				case 'V':
				case 'v':
					doAction("Vaixell");
					break;
				case 'S':
				case 's':
					System.out.println("\nAdéu-siau");
					break;
				default: System.out.println("\nOpció incorrecta");
			}	
		}while (option != 'S' && option !='s');
		
	};
	
	public static void doAction (String vehicle) {
		Actions actions = new Actions();
		char option;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\nMoviments");
			System.out.println("A - Arrencar");
			System.out.println("C - Accelerar");
			System.out.println("F - Frenar");	
			System.out.println("S - Deixar vehicle");
			option = sc.nextLine().charAt(0);
			switch (option) {
				case 'A':
				case 'a':
					ArrencarVehicle ar = new ArrencarVehicle(actions);
					garatge.setCommand(ar);
					break;			
				case 'C':
				case 'c':
					AccelerarVehicle ac = new AccelerarVehicle(actions);
					garatge.setCommand(ac);
					break;
				case 'F':
				case 'f':					
					FrenarVehicle fr = new FrenarVehicle(actions);
					garatge.setCommand(fr);
					break;				
				case 'S':
				case 's':
					System.out.println("\nCàmera de seguretat - "+vehicle);
					garatge.executeCommandList(vehicle);
					garatge.eraseCommandList();
					break;
				default: System.out.println("\nOpció incorrecta");
			}	
			
		}while (option != 'S' && option !='s');
		
		System.out.println("\nPulsa intro per retornar al garatge\n");
		option = sc.nextLine().charAt(0);
		
	}
}
