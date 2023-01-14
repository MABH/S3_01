package n2exercici1;

import java.util.Scanner;

public class DadesFrança implements IPais{
	private String pais;
	private String carrer;
	private String cp;
	private String ciutat;
	private String telefon;
	private final static String codiPais = "+33";
	private String direccio;
	private Dades dades;
	
	public DadesFrança() {
		getPais();
		CrearDades();		
	}


	@Override
	public void getPais() {
		pais = "França";		
	}
	
	public void CrearDades () {
		Scanner sc=new Scanner(System.in);		
		
		System.out.print("\nIntrodueix el carrer: ");
		carrer = sc.nextLine();
		System.out.print("\n");
		
		do {
			System.out.print("Introdueix el codi postal: ");
			cp = sc.nextLine();
			System.out.print("\n");
			if (cp.length()!=5) System.out.println("Nº de digits incorrecte");
		}while(cp.length()!=5);	
		
		System.out.print("Introdueix la ciutat:");
		ciutat = sc.nextLine();
		System.out.print("\n");
		
		do {
			System.out.print("Introdueix el telefon: "+ codiPais+" ");
			telefon = sc.nextLine();
			System.out.print("\n");
			if (telefon.length()!=10) System.out.println("Nº de digits incorrecte");
		}while(telefon.length()!=10);	
		
		
		direccio = carrer + "\n" + cp +  " " + ciutat + "\n" + pais + "\n";
		telefon = codiPais + telefon;
		
		dades = new Dades(direccio, telefon);
	}
	
	public Dades getDades() {
		return dades;		
	}
}
