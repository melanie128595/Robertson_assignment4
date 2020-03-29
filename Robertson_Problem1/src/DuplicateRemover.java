import java.io.File;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class DuplicateRemover {
    Set<String> uniqueWords;
    void remove(String dataFile) 
    {
        Scanner inputfile=null;
        try {
            uniqueWords = new LinkedHashSet<>();
            inputfile = new Scanner(new File(dataFile)); 
            while(inputfile.hasNextLine()) 
            {
                String line=inputfile.nextLine(); 
                String[] uniqueWords=line.split(" "); 
            }

        }
        catch(Exception e) 
        {
            System.out.println("Sorry an error has occured while trying to open file"+dataFile);
        }
        if(inputfile!=null)
            inputfile.close();


    }
    void write(String outFile) 
    {
        FileWriter outputfile=null;
        try {
            outputfile = new FileWriter(outFile); 
            for(String s:uniqueWords) 
                outputfile.write(s+"\n"); 
            outputfile.close(); 
        }
        catch(Exception e) 
        {
            System.out.println("Sorry an error has occured while writing the file "+outFile);
        }

    }

}