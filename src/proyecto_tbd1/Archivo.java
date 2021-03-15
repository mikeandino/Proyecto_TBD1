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
    private String ruta_archivo = "personas.mrt";

    public void escribir(Persona x)
    {
        try {
            //Objeto a guardar en archivo *.DAT
            Persona persona = null;
            persona = new Persona(x.getUsuario(), x.getPass(), x.getTipo());
            //Se crea un Stream para guardar archivo
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream( this.ruta_archivo ));
            //Se escribe el objeto en archivo
            file.writeObject(persona);
            //se cierra archivo
            file.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void leer()
    {
        try {
            //Stream para leer archivo
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( this.ruta_archivo ));
            //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
            Persona persona = (Persona) file.readObject();
            ArrayList <Persona> personas  = new ArrayList<Persona>();
            personas.add(persona);
            //se cierra archivo
            file.close();
            
            for (int i = 0; i < personas.size(); i++) {
                personas.get(i).toString();
            }
        } catch (ClassNotFoundException ex) {
             System.out.println(ex);
        } catch (IOException ex) {
             System.out.println(ex);
       }
    }

}
