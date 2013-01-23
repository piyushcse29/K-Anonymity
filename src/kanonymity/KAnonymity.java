/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kanonymity;
import java.io.*;
import java.util.*;
/**
 *
 * @author piyush
 */
public class KAnonymity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String dataset[][]=new String[100][15];
            FileInputStream inputfile=new FileInputStream("Adult.txt");
            InputStreamReader Im=new InputStreamReader(inputfile);
            BufferedReader br=new BufferedReader(Im);
            System.out.println("Text from File is as Follows..");
           
            for(int i=0;i<100;i++){
                int j=0;
                String text=br.readLine();
                StringTokenizer st=new StringTokenizer(text,",");
                 while(st.hasMoreTokens()){
                   dataset[i][j]=st.nextToken();
                   j++;
                 }
                System.out.println(dataset[i][14]);
            }
  //Applying Generalixzation      
            
            
  
        
        // TODO code application logic here
    }
}
