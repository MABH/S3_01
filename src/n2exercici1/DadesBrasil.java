package n2exercici1;

import java.util.Scanner;

public class DadesBrasil implements IPais{
	private String pais;
	private String regio;
	private String carrer;
	private String cp;
	private String codiZona;
	private String ciutat;
	private String telefon;
	private final static String codiPais = "+55";
	private String direccio;
	private Dades dades;
	
	public DadesBrasil() {
		getPais();
		CrearDades();		
	}

	@Override
	public void getPais() {
		pais = "Brasil";		
	}
	
	public void CrearDades () {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nIntrodueix el carrer: ");
		carrer = sc.nextLine();
		System.out.print("\n");
		
		System.out.print("Introdueix la ciutat:");
		ciutat = sc.nextLine();
		System.out.print("\n");
		
		System.out.print("Introdueix la regió:");
		regio = sc.nextLine();
		System.out.print("\n");
		
		do {
			System.out.print("Introdueix el codi postal: ");
			cp = sc.nextLine();
			System.out.print("\n");
			if (cp.length()!=5) System.out.println("Nº de digits incorrecte");
		}while(cp.length()!=5);	
		
		do {
			System.out.print("Introdueix el codi de zona: ");
			codiZona = sc.nextLine();
			System.out.print("\n");
			if (codiZona.length()!=3) System.out.println("Nº de digits incorrecte");
		}while(codiZona.length()!=3);	
		
		do {
			System.out.print("Introdueix el telefon: "+ codiPais+" ");
			telefon = sc.nextLine();
			System.out.print("\n");
			if (telefon.length()<10 || telefon.length()>11) System.out.print("Nº de digits incorrecte");
		}while(telefon.length()<10 || telefon.length()>11);	
		
		
		direccio = carrer + "\n" + ciutat  + ", " + regio + "\n" + cp + "-" + codiZona + "\n" + pais + "\n";
		telefon = codiPais + telefon;
		
		dades = new Dades(direccio, telefon);
	}
	
	public Dades getDades() {
		return dades;		
	}
}
