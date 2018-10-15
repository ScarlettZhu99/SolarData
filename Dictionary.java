


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.InputStreamReader;


/**
 *
 * @author Yueming Meng
 */
public class Dictionary {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        HashMap<String, Integer> Dict = new HashMap<>();
        int i=1;
        Scanner s= new Scanner(new BufferedReader(new FileReader("dict.txt")));
        while (s.hasNext()) {
            Dict.put(s.next(),i);
            i++;
        }
       
        
        
          System.out.println("Please in put a key");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        String search = br.readLine();
        
        if (Dict.containsKey(search))
            System.out.println("The word is in the dictionary");
        else
            System.out.println("mis-spelled");  
        
        
    }
    
}
