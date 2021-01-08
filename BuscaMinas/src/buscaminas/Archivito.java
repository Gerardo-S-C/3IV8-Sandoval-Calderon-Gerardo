/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author illum
 */
class Archivito implements Serializable{
    private static final long serialVersionUID = 3L;
    
    ArrayList<Usuarios> listatotal=new ArrayList<>();
    public ArrayList<Usuarios> ler(){
        
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("Panitas.txt"));
            listatotal=(ArrayList<Usuarios>)in.readObject();
            in.close();           
        } catch (Exception ex) {
            System.out.println("Perate manito... "+ex);
        }
        return listatotal;
    }
    void serializar(ArrayList<Usuarios> listaserie){
        try{            
            ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("Panitas.txt"));
            objout.writeObject(listaserie);
            objout.close();
        
        }catch(Exception e){
            System.out.println("Ni pepe mano, lo que pasa es... "
                    + e.getMessage()); 
        }
    }
}
