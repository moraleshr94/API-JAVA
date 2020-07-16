package apiprueba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteAgreement{

    //public void write(String name, String sb, ArrayList pr) {
    public void write(Agreement ob) {
    	String user = System.getProperty("user.name");
    	String result = ob.getName().replaceAll("[/]","");
    	//System.out.println(result);
    			
    	String route= "C:\\Users\\"+user+"\\Desktop\\"+result+".txt";
    	String prod ="";
    	for(int i = 0; i < ob.getProducts().size(); i++)
    	{
    		prod=prod+ob.getProducts().get(i)+" ";
    	}
    	
        File file = new File(route);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            //fr.write("Agremment name: ");
            fr.write(ob.getName()+"\n" );
            //fr.write("\nSigned by: ");
            fr.write(ob.getSignedBy()+"\n" );
            //fr.write("\nProducts: ");
            fr.write(prod);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
