package apiprueba;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Agreement {
	String name;
	String signedBy;
	ArrayList products = new ArrayList();

	Agreement(String signedBy,	ArrayList products)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");  
		LocalDateTime now = LocalDateTime.now();  
		name= "Agreement "+ dtf.format(now);
		this.signedBy = signedBy;
		this.products = products;
	}
	

	Agreement(String name, String signedBy,	ArrayList products)
	{
		this.name = name;
		this.signedBy = signedBy;
		this.products = products;
	}
		
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		name = name;
	}
	
	public String getSignedBy()
	{
		return signedBy;
	}
	
	public void setSignegBy(String signedBy)
	{
		signedBy = signedBy;
	}
	
	public ArrayList getProducts()
	{
		return products;
	}
	
	public void setProducts(ArrayList products)
	{
		products = products;
	}
	
}
