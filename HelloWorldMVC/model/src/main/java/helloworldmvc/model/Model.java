package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		 String fileName = Model.class.getResource("message.txt").getFile() ;
		 String line = null;
		 try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println("Unable to open file '" + fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println("Error reading file '" + fileName + "'");   
	        }
		 
		return line;
	}

}
