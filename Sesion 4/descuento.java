/* EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65,
AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. SI LA EDAD ES 
MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS. SI LA
RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 45%; EN CASO
CONTRARIO, SE LES APLICA UN 25%.
*/
import java.util.Scanner;

class descuento{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        //variables
        int edad;
        double precio,abono;
        char opcion,reinicio;
        do{
        System.out.println("Introduzca el abono a descontar:");
        abono = entrada.nextInt();
        System.out.println("Introduzca su edad:");
        edad = entrada.nextInt();
            if (edad>65){
            precio = abono*0.6;
            System.out.println("El abono con descuento es de: "+precio);
            }
            else if (edad<65 && edad>21){
            System.out.println("Sus padres son socios? s/n (escriba su respuesta con letras minusculas)");
            opcion = entrada.next().charAt(0);
                switch (opcion) {
                case 's':
                    precio = abono*0.55;
                    System.out.println("El abono con descuento es de: "+precio);
                    break;
                case 'n':
                    precio = abono*0.75;
                    System.out.println("El abono con descuento es de: "+precio);
                    break;
                default:
                System.out.println("No ingreso una respuesta valida, intentelo de nuevo");
                break;
                }
        }    
        else{
            System.out.println("No puede realizar esta accion, debe ser mayor de 21 años");
        }
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
    }
}