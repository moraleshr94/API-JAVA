package apiprueba;

import java.util.ArrayList;

public class main {
	public static void  createFile(Agreement agr)
	{
		WriteAgreement wa = new WriteAgreement();
		wa.write(agr);
	}
	
	public static void creteAgreementObj(String route)
	{
		LoadAgreement la = new LoadAgreement(); 
		
		la.readFile(route);
		la.loadData();
		Agreement agr = new Agreement(la.getFile().get(1), la.getProducts() );
		System.out.println("---- READED FILE'S CONTENT----");
		System.out.println(agr.getName());
		System.out.println(agr.getSignedBy());
		System.out.println(agr.getProducts());
	}

	public static void main(String[] args) {
		
				ArrayList fr = new ArrayList();
		fr.add("Libro");
		fr.add("Reloj");
		fr.add("Mesa");
		fr.add("Impresora");
		fr.add("Bocina");
		
		Agreement agr = new Agreement("Lorena Corona Lima",fr);
		
		createFile(agr);
		creteAgreementObj("C:\\Users\\Rafael\\Desktop\\Agreement 16072020.txt");
		
		
	}

}