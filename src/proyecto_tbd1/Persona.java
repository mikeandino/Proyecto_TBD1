/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tbd1;

/**
 *
 * @author tiffa
 */
public class Persona {
    private String usuario;
    private String pass;
    private String tipo;

    public Persona() {
    }

    public Persona(String usuario, String pass, String tipo) {
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Persona{" + "usuario=" + usuario + ", pass=" + pass + ", tipo=" + tipo + '}';
    }
    
}
