package general.seit.solution3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Dictionary {

	public static void main(String[] args) {
	
		String path = "src/general/seit/solution3/Dictionary.txt";
		String line = null;

		try{
			doesFileExist(path);
			
			FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
           
            while((line = bufferedReader.readLine()) != null) {
	                splitString(line);	             	                
	        }   
	            
	        bufferedReader.close();   
	            
		}catch(FileNotFoundException ex){
			
			System.out.println("Unable to open file '" + path + "'");
			
		}catch(IOException ex) {
            System.out.println( "Error reading file '" + path + "'");                  
                // Or we could just do this: 
                // ex.printStackTrace();
        }
	}
	
	
	public static boolean doesFileExist(String path) {
		
		File file = new File(path);

			if(file.exists() && !file.isDirectory()){
				System.out.println("File Found\n");
				return true;
				
			}else {
				System.out.println("File NOT Found\n");
			}
			
			return false;		
	}
	
	
	public static void splitString(String s){
		
		    String[] part1 = s.split(" – ");
			System.out.println(part1[0]);
			
			String[] part2 = part1[1].split(", ");	
			for(String res :part2){
				System.out.println(res);
			}			
    }
}
