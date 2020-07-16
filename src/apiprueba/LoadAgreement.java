package apiprueba;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LoadAgreement {

	ArrayList<String> newfile = new ArrayList<String>();
	ArrayList products = new ArrayList();
	
	public ArrayList<String> getFile()
	{
		return newfile;
	}
	
	public ArrayList<String> getProducts()
	{
		return products;
	}
	
	public void readFile(String routefile){
		try {
			ArrayList<String> aux = new ArrayList<String>(); 
            Scanner input = new Scanner(new File(routefile));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                aux.add(line);
            	}
            	newfile = aux;
            	input.close();
        	} catch (Exception ex) {
        		ex.printStackTrace();
        		System.out.println("FILE NOT FOUND!");
        	}
	}
	
	public void loadData()
	{   
		ArrayList aux= new ArrayList();
		StringTokenizer tokens=new StringTokenizer(newfile.get(2));
		while(tokens.hasMoreTokens()){
	          aux.add(tokens.nextToken());
			//System.out.println(tokens.nextToken());
		}
		products = aux;
	}
	/*
	public void imprime()
	{
		for(int i=0; i< newfile.size(); i++)	
		{
			System.out.println(newfile.get(i));
		}	
	}
	*/		
}