//subclase heredada de libros
//lo caracteriza la cantidad de libros disponibles
//
import java.util.Scanner;
public class prestamo extends libros{
    private int x;
    private int numal = (int) (Math.random()*0+1);
    public prestamo(){
    }
    //constructor con los atributos de la clase junto a los heredados
    public prestamo(String titulo, String autor, int libro, int prestados, int x, int numal){///mas variables??
        super(titulo, autor, libro, prestados);
        this.x=x;
        this.numal=numal;
    }
    
    public void mostrarPrestamo(){
        if (getNumal()==0){
            System.out.println("Hay libros disponibles ("+getNumal()+")");

        }
        else if (getNumal()==1){
            System.out.println("No hay libros disponibles, no se pueden pedir ejemplares ("+getNumal()+")");
        }
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getNumal(){
        return numal;
    }
    public void setNumal(int numal){
        this.numal=numal;
    }
}
