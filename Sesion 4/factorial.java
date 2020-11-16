/*ESCRIBA UN PROGRAMA QUE LEA UN ENTERO NO NEGATIVO Y QUE CALCULE E IMPRIMA SU FACTORIAL. */
import java.util.Scanner;

class factorial{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num,factorial;
        char reinicio;
        do{
        factorial=1;
        System.out.println("Ingrese un numero entero NO negativo: ");
        num=entrada.nextInt();
        do{
        factorial=factorial*num;
        num=num-1;
        }while(num>0);
        System.out.println("El factorial del numero ingresado es "+factorial);
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
    }
}