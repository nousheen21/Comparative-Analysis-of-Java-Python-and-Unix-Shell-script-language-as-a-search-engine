package reader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner parameter= new Scanner(System.in);
		String str1="Timestamp";
		String str2="City";
		System.out.println("Write 'TimeStamp' to give timestamp as input/ Write 'City' to give city as input: ");
		
		String c = parameter.nextLine();
		String Time="";
		String City="";
		
		if(c.equals(str1)){
			System.out.println("Enter the Timestamp: ");
			Time= parameter.nextLine();
		}
			else{
				System.out.println("Enter the city: ");
				City=parameter.nextLine();	
		}
		
		
		String csvFile = "H:/ECLIPSE PROJECTS/ReadCsvFile/Data.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] country= new String[100];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

          
        	   if(c.equals(str1)){
        		   while ((line = br.readLine()) != null) {
                	   country = line.split(cvsSplitBy);
                	   if(country[0].equals(Time)){
                		   System.out.println("Timestamp: "+ country[0]+ ", City: "+ country[1]+ ", Temperature: "+ country[2]+ ", Light: "+ country[3]+ ", Airquality: "+ country[4]+ ", Sound: "+ country[5]+ ", humidity:  "+ country[6]);
                	   }
        		   }
        		  	   
        		  }
        		   
        	   if(c.equals(str2)){
        			   while ((line = br.readLine()) != null) {
                    	   country = line.split(cvsSplitBy);
        			   
                    	   if(country[1].equals(City)){
                    		   System.out.print("City: "+ country[1]+ ", Timestamp: "+ country[0]);
                    		   System.out.print(", Temperature: "+ country[2]+ ", Light: "+ country[3]);
                    		   System.out.print(", Airquality: "+ country[4]+ ", Sound: "+ country[5]);
                    		   System.out.println(", humidity:  "+ country[6]+ ", dust: "+ country[7]);
                    	   }
        			   }
        	   }
        }
        			  
            
            
        
        catch (IOException e) {
            e.printStackTrace();
                   }
        }
}
	
            
      
        	  

        
        

                   

            

