/*CREA UN PROGRAMA QUE GUARDE LA INFORMACIÓN DE CADA UNO DE LOS LIBROS DE UNA BIBLIOTECA. 
LA CLASE DEBE GUARDAR EL TITULO DEL LIBRO, AUTOR, NÚMERO DE EJEMPLARES DEL LIBRO Y NÚMERO DE EJEMPLARES PRESTADOS. 
EL PROGRAMA DEBERA TENER LA OPCION DE PRESTAMO DE LIBRO ---
CONOCER LA CANTIDAD EXISTENTE (ESTA DEBERA IR DECRECIENDO CADA QUE SE REALICE UN PRESTAMO) ---
NO SE PODRAN PRESTAR LIBROS DE LOS QUE NO QUEDEN EJEMPLARES DISPONIBLES PARA PRESTAR. ---
TAMBIEN SE PODRA REALIZAR LA DEVOLUCION DE UN LIBRO ---
NO SE PODRAN DEVOLVER LIBROS QUE NO SE HAYAN PRESTADO*/

import java.util.Scanner;
import javax.swing.*;

public class libros{
    private String titulo;
    private String autor;
    private int libro;
    private int prestados;
    //constructor con parametros
    public libros(String titulo, String autor, int libro, int prestados){
        this.titulo=titulo;
        this.autor=autor;
        this.libro=libro;
        this.prestados=prestados;
    }
    //constructor vacio
    public libros(){
    }
    /*
    //metodo para el prestamo
    
    //metodo para la cantidad existente que son 3 libros

    //metodo para indicar la inexistencia de un libro

    //metodo para la devolucion de un libro
    No se hicieron y decidi ver que onda con la herencia a ver si cala*/
    //geters y seters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getLibro(){
        return libro;
    }
    public void setLibro(int libro){
        this.libro=libro;
    }
    public int getPrestados(){
        return prestados;
    }
    public void setPrestados(int prestados){
        this.prestados=prestados;
    }
}