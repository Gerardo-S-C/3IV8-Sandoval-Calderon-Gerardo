/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.io.Serializable;

/**
 *
 * @author illum
 */
public class Usuarios implements Serializable{
    private String nombre;
    private String edad;
    
    Archivito archivito=new Archivito();
    
    public Usuarios(){
    }

    public Usuarios(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
