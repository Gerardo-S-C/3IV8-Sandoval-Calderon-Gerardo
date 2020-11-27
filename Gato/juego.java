//Esta sera la clase principal para el juego del gato
//lo pienso hacer con arreglos, para que me imprima el "panel" donde se pueda "jugar"
//reutilizare parte del codigo de matrices donde me imprime el arreglo pero cambiando valores, que me arroje el tablero de una
//para solo poner los datos 
import java.util.*;
import javax.swing.*;

public class juego{
    public static void main(String[]args) {//metodo principal donde se ejecutaran todos los metodos y clases
        acciones panes=new acciones();
        panel pan=new panel();
        pan.mostrarPanel();
        panes.camcuad();
    }
}