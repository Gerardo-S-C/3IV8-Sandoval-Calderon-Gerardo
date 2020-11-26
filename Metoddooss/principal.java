import java.util.*;
import javax.swing.JOptionPane;
class principal{
    int k;
    public static void main(String[]args) {
        sueldo p1=new sueldo();
        proovedor p2=new proovedor();
        prestamo pres=new prestamo( );
        devoluciones devo=new devoluciones( );
            System.out.println("Aca se muestra el problema de los libros con decisiones random en lo que veo\n como le hago pa meterle datos sin que me salgan errores\n");
            pres.mostrarPrestamo();
            System.out.println("--------");
            devo.mostrarDevoluciones();
            System.out.println("--------");
            p2.print();
            // al ultimo este que es el que tiene joptionpane
            p1.salida();
    } 
}