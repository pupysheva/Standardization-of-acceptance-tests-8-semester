/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternfasadstandardizationpsi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pupys
 */
public class FasadFileOperations {
    String readFile(String fname) throws FileNotFoundException, IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fname));
        StringBuilder strBuilder = new  StringBuilder();
        int i = 0;
        while((i=reader.read()) != -1){
            strBuilder.append((char)i);
        }
        return strBuilder.toString();
    }
   
    boolean writeFile(String fname, String stringForWrite, boolean append){
        try(FileWriter writer = new FileWriter(fname, append)){
            writer.write(stringForWrite);
            writer.flush();
            return true;
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
