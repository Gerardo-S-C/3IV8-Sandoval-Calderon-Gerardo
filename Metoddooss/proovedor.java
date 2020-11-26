/*REALIZAR UN PROGRAMA DE LA CLASE PROOVEDORES
SUS VARIABLES DE INSTANCIA SON: 
NOMBRE_CLIENTE (CADENA)
PRODUCTO(CADENA ARREGLO DE 10 ELEMENTOS)
COSTO (ENTERO ARREGLO DE  10 ELEMENTOS) 
CANTIDAD DE PRODUCTO EXISTENTE(ENTERO ARREGLO DE 10 ELEMEMENTOS)
EL PROGRMA DEBE OBTENER LA SUMA TOTAL DE COSTOS YY
EL COSTO MAYOR Y EL COSTO MENOR YY
EL COSTO PROMEDIO DE LOS PRODUCTOS YY
EL COSTO TOTAL DE PRODUCTO LA CANTIDAD EXISTENTE 
DESPLEGAR EN PANTALLA EL NOMBRE DEL PROVEEDOR LOS PRODUCTOS, LA CANTIDAD EXISTENTE Y EL COSTO DE CADA UNO DE ELLOS.
*/ 
//aqui como son otro tipo de operaciones no me avente a hacerlo con joptionpane ;P
//poner un random para indicar si hay o no disponibilidad
import java.util.Scanner;
import javax.swing.*;
public class proovedor{
    Scanner entrada = new Scanner (System.in);
    //private int prod;
    private String cliente;
    private String[] producto=new String[10];
    private int[] costo=new int[10];
    private int[] cantidad=new int[10];
    int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma=0;
    public void print(){
        System.out.println("Ingrese el precio de los productos: ");
        mmprosum(costo);
        System.out.printf("El mayor valor es %d y el menor es %d.", mayor, menor);
        float prom=suma/costo.length;
        System.out.printf("\nLa suma total es de: "+suma+" con un promedio de: "+prom);
        System.out.print("\nY el proovedor de la tienda misma y entera es: Tiendas zorro\n");
        System.out.println("Asi que no hay mucho que elejir ");

    }
    public int[] mmprosum(int[]mym){
        for(int i=0;i<costo.length;i++){
            costo[i]=entrada.nextInt();
            mayor = Integer.max(mayor, costo[i]);
            menor = Integer.min(menor, costo[i]);
            suma=suma+costo[i];
        }
        return costo;
    }
    //encapsulamiento de datos
    public void setCliente(String c){
        cliente=c;
    }
    public String getCliente(){
        return cliente;
    }
    public void setProducto(String[] p){
        producto=p;
    }
    public String getProducto(){
        return producto[10];
    }
    public void setCosto(int[] cos){
        costo=cos;
    }
    public int getCosto(){
        return costo[10];
    }
    public void setCantidad(int[] can){
        cantidad=can;
    }
    public int getCantidad(){
        return cantidad[10];
    }
    /*public int setProd(String pro){
        prod=pro;
    }
    public String getProd(){
        return prod;
    }*/
}