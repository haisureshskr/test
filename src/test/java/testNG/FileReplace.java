package testNG;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReplace {

	static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\\\Users\\\\surkukum\\\\eclipse-workspace\\\\test\\\\src\\\\test\\\\resources\\\\txt\\\\text.txt";
		String folder = "C:\\Users\\surkukum\\eclipse-workspace\\test\\src\\test\\resources\\txt\\";
		String Nwfolder = "\\\\phxnas201.strgsvcdaiphx.peocorpphxappv1.oraclevcn.com\\PSTO\\HRMS\\DMSScripts\\";
		Path dir = Paths.get(folder);
		System.out.println(dir);
		try (DirectoryStream<Path> stream =Files.newDirectoryStream(dir, "*.dms")) 
		{
			    for (Path entry: stream) {
			        System.out.println(entry.getFileName());
			        String file = entry.toString() ;
			        //modifyFile(file,"phxnas201.strgsvcdaiphx.peocorpphxappv1.oraclevcn.com", "slcnas463" );
			        System.out.println("done for"+ file);
			    }
			} catch (IOException x) {
			    // IOException can never be thrown by the iteration.
			    // In this snippet, it can // only be thrown by newDirectoryStream.
			    System.err.println(x);
			}
		
		
		//modifyFile(fileName, "psbldfs\\\\dfs", "phxnas203.strgsvcdaiphx.peocorpphxappv1.oraclevcn.com");
		
		//modifyFile(fileName, "slcnas463", "phxnas203.strgsvcdaiphx.peocorpphxappv1.oraclevcn.com");
        
		//modifyFile("\\\\phxnas201.strgsvcdaiphx.peocorpphxappv1.oraclevcn.com\\PSTO\\HRMS\\DMSScripts\\text.txt", "slcnas463", "phxnas201.strgsvcdaiphx.peocorpphxappv1.oraclevcn.com");
		
        System.out.println("done");
	}

}
