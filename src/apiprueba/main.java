package apiprueba;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		LoadAgreement ag = new LoadAgreement(); 
		String user = System.getProperty("user.name");
		String ruta = ("C:\\Users\\"+user+"\\Desktop\\Agreement 16072020.TXT");
		ag.leerArchivo(ruta);
		ag.cargarDatos();
		 /*
		Agreement agrr = new Agreement(ag.getArchivo().get(0), ag.getArchivo().get(1), ag.getProductos() );
		
		System.out.println(agrr.getName());
		System.out.println(agrr.getSignedBy());
		System.out.println(agrr.getProducts());
		*/
		/*
		WriteAgreement wr = new WriteAgreement();
		ArrayList fr = new ArrayList();
		fr.add("Lol");
		fr.add("ttt");
		wr.write("Agreement 17072020", "Gerardo", fr);
		*/
		
		/*
		ArrayList fr = new ArrayList();
		fr.add("Lol");
		fr.add("ttt");
		
		Agreement agr = new Agreement("Lorena",fr);
		
		createFile(agr);
		creteAgreementObj("C:\\Users\\Rafael\\Desktop\\Agreement 16072020.txt");
		*/
		
	}
	
	public static void  createFile(Agreement agr)
	{
		WriteAgreement wa = new WriteAgreement();
		wa.write(agr);
	}
	
	public static void creteAgreementObj(String route)
	{
		LoadAgreement la = new LoadAgreement(); 
		//String user = System.getProperty("user.name");
		//String route = ("C:\\Users\\"+user+"\\Desktop\\Agreement 16072020.TXT");
		la.readFile(route);
		la.loadData();
		Agreement agr = new Agreement(la.getFile().get(1), la.getProducts() );
		System.out.println("---- READED FILE'S CONTENT----");
		System.out.println(agr.getName());
		System.out.println(agr.getSignedBy());
		System.out.println(agr.getProducts());
	}

}
