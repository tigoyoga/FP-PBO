/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ReadFilePath {
   
    File directoryPath = new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\FP-PBO\\CashierApp");
   public List<String> getFile() throws IOException {
       
       List<String> Arr = new ArrayList<>();

      File filesList[] = directoryPath.listFiles();
      for(File file : filesList) {
          
          if(file.getName().contains(".txt")){
              Arr.add(file.getName().substring(0, 12));
          }
      }
      
       return Arr;
   }
   
   public String readContent(String name) throws FileNotFoundException{
       File filesList[] = directoryPath.listFiles();
       
       StringBuilder sb = new StringBuilder();
       for(File file: filesList){
           if(file.getName().equals(name) ){
               Scanner sc= new Scanner(file);
               String input;
               
            while (sc.hasNextLine()) {
                input = sc.nextLine();
                sb.append(input).append("\n");
                }
           } 
       }
       
       return sb.toString();
   }

}
