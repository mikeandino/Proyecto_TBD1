/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tbd1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Michael Andino
 */
public class Bitacoras {
    public void logger(StringBuilder logs,String name){    
        try {
            File text = new File("./logs/"+name+".txt");
            FileWriter writer = new FileWriter(text);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(logs.toString());
            bw.flush();
            bw.newLine();
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
}
