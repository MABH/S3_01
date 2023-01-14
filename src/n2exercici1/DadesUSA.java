package n2exercici1;

import java.util.Scanner;

public class DadesUSA implements IPais{
	private String pais;
	private String carrer;
	private String cp;
	private String regio;
	private String ciutat;
	private String telefon;
	private final static String codiPais = "+01";
	private String direccio;
	private Dades dades;
	
	public DadesUSA() {
		getPais();
		CrearDades();		
	}


	@Override
	public void getPais() {
		pais = "USA";		
	}
	
	public void CrearDades () {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nIntrodueix el carrer: ");
		carrer = sc.nextLine();
		System.out.print("\n");
		
		System.out.print("Introdueix la ciutat:");
		ciutat = sc.nextLine();
		System.out.print("\n");
		
		do {
			System.out.print("Introdueix el codi postal: ");
			cp = sc.nextLine();
			System.out.print("\n");
			if (cp.length()!=5) System.out.println("Nº de digits incorrecte");
		}while(cp.length()!=5);	
		
		do {
			System.out.print("Introdueix la regió: ");
			regio = sc.nextLine();
			System.out.print("\n");
			if (regio.length()!=2) System.out.println("Nº de digits incorrecte");
		}while(regio.length()!=2);	
		
		do {
			System.out.print("Introdueix el telefon: "+ codiPais+" ");
			telefon = sc.nextLine();
			System.out.print("\n");
			if (telefon.length()!=10) System.out.print("Nº de digits incorrecte");
		}while(telefon.length()!=10);	
		
		
		direccio = carrer + "\n" + ciutat + ", " + regio + " " + cp + "\n" + pais + "\n";
		telefon = codiPais + telefon;
		
		dades = new Dades(direccio, telefon);
	}
	
	public Dades getDades() {
		return dades;		
	}
}
