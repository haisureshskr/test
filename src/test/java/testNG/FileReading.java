package testNG;
import java.io.*;
import org.apache.commons.io.FileUtils;
public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File path is passed as parameter
        File file = new File("C:\\Users\\surkukum\\eclipse-workspace\\test\\src\\test\\resources\\txt\\text.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
        try {
            String data = FileUtils.readFileToString(file);
           data = data.replace("suresh", "suresh1");
            FileUtils.writeStringToFile(file, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        	br.close();
	}

}
