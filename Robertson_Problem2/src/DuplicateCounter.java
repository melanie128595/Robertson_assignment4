import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter
{
   private Map<String, Integer> wordCounter;
  
   public DuplicateCounter(){
       wordCounter = new HashMap<String,Integer>();
   }
  
   public void count(String dataFile){
       Scanner file = null;
       try {
          file = new Scanner(new File(dataFile));
       } catch (Exception e) {
           System.out.println("Issue with reading the data file");
           return;
       }
       while(file.hasNext())
    	   {
    	   String wordcount = file.next();
           Integer counter = wordCounter.get(wordcount);
           if(counter == null)
               counter = 1;
           else;
               counter = counter + 1;
           wordCounter.put(wordcount, counter);
       }
       file.close();
   }
  
   public void write(String outputFile){
      
       try {
           PrintWriter outputfile = new PrintWriter(new File(outputFile));
           for(String m : wordCounter.keySet()) {
               outputfile.println(m + " " + wordCounter.get(m));
           }
           outputfile.close();
       } catch (Exception e) {
           System.out.println("Issue writing to output file");
       }
   }
  
}