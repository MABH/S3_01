package n2exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class n2exercici1 {
	private static ArrayList<Dades> contactes = new ArrayList<Dades>();
	
	public static void main(String[] args) {		
        char opcio;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("\nA - Afegir contacte");
			System.out.println("V - Veure contactes"+"\nS - SORTIR");			
			opcio = sc.nextLine().charAt(0);
			
			ComprovarOpcio(opcio);
		} while (opcio!='S' && opcio!='s');
		sc.close();
	}
	
	private static void ComprovarOpcio(char opcio) {
		if (opcio=='v' || opcio =='V'){
			if(!contactes.isEmpty()) contactes.forEach((n) -> 
							System.out.println("\nDirecció:\n"+n.getDireccio()+"\nTelefon: "+n.getTelefon()));
			else System.out.println("\nNo hi han contactes");
		}else CrearContacte(opcio);
	}
	
	private static void CrearContacte(char opcio) {
		String pais ="";
		Scanner sc=new Scanner(System.in);
        AbstractFactoryAgenda factory;        
			
		System.out.println("\nIntrodueix el pais:");
		do {
			System.out.println("\nA - Alemania");
			System.out.println("B - Brasil");	
			System.out.println("F - França");
			System.out.println("U - USA");
			opcio = sc.nextLine().charAt(0);
			
			switch(opcio) {
			case 'A':
			case 'a':
				pais = "Alemania";
				break;	
			case 'B':
			case 'b':
				pais = "Brasil";
				break;	
			case 'F':
			case 'f':
				pais = "França";
				break;	
			case 'U':
			case 'u':
				pais = "USA";
				break;	
			default: System.out.println("\nPais incorrecte");
			break;
			};
		} while (opcio!='A' && opcio!='a' && opcio!='F' && opcio!='f' && opcio!='B' && opcio!='b' && opcio!='U' && opcio!='u');
		
		
		factory = PaisFactoryProducer.getFactory(pais);
		IPais nouPais = factory.getPais(pais);
		contactes.add(nouPais.getDades());
	}
}
