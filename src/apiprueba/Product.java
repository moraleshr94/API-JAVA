package apiprueba;

public class Product {
	
	String paretObject;
	String[] products = new String[5];
	String name;
	float precio;
	
	Product(String paretObject,	String[] products, String name,	float precio)
	{
		this.paretObject = paretObject;
		this.products = products;
		this.name = name;
		this.precio = precio;
	}
	
	public String getParetObject()
	{
		return paretObject;
	}
	
	public void setParetObject(String paretObject)
	{
		paretObject = paretObject;
	}
	
	public void setProducts(String products)
	{
		products = products;
	}
	
	public String[] getProducts()
	{
		return products;
	}	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		name = name;
	}
	
	public float getPrecio()
	{
		return precio;
	}
	
	public void setPrecio(float precio)
	{
		precio = precio;
	}

}
