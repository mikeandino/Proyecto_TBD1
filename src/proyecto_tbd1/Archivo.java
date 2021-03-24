/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tbd1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class Archivo {
    ArrayList <Persona> personas = new ArrayList();
    ArrayList <Persona> temp = new ArrayList();
    String archivo = "personas.mrt";
    public Archivo() {
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    
    
    public void Escribir(){
        try
            {
                 
            // Se abre el fichero donde se hará la copia
            FileOutputStream fileOutput = new FileOutputStream( archivo );
            ObjectOutputStream file = new ObjectOutputStream(fileOutput);
             
            //Se escribe el objeto en archivo
            for(int cont = 0; cont < 4; cont++){
                file.writeObject(personas.get(cont));
            }
            //se cierra archivo
            file.close();
            System.out.println("Se guardó el arreglo con exito...");
        } catch (IOException ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }
    
    public void Leer(){
             //Leemos los datos del archivo y los cargamos en el arreglo
        try {
            //Stream para leer archivo
            FileInputStream fileInput = new FileInputStream(archivo);
            ObjectInputStream file = new ObjectInputStream(fileInput);
            
           for(int cont = 0; cont < 4; cont++){
                temp.add((Persona) file.readObject());
           }
            //se cierra archivo
            file.close();    
            setPersonas(temp);
            for (int i = 0; i < 4; i++) {
                System.out.println("Pos "+i+": "+personas.get(i).toString());
            }
        } catch (ClassNotFoundException ex) {
             System.out.println(ex);
        } catch (IOException ex) {
             System.out.println(ex);
       }
    }
}