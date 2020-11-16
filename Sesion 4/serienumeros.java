/*ELABORA UN PROGRAMA DONDE SE INTRODUCE UNA SERIE DE NUMEROS DEBERA CONTAR 
CUANTOS SON POSITIVOS  Y CUANTOS NEGATIVOS. */
import java.util.Scanner;

class serienumeros{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        //variables
        int num1, positivos, negativos,p1,n1;
        char num2,reinicio;
        positivos=0;
        negativos=0;
        do{
        System.out.println("Introduzca una serie de numeros cualesquiera, para detenerse ingrese un valor mayor a 10000 o menor a -10000 (de lo contrario, el programa seguira ejecutandose):");
        do{
        num1= entrada.nextInt();
        
            if (num1>=0){
                p1=positivos;
                positivos=1+p1;
            }
            else if (num1<0){
                n1=negativos;
                negativos=1+n1;
            }
            System.out.print("Hay " +positivos);System.out.print(" numeros positivos");
            System.out.println("");
            System.out.print("Y hay " +negativos);System.out.print(" numeros negarivos");
            System.out.println("");
        }while (num1<10001 && num1>-10001);
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
        positivos=positivos-positivos;
        negativos=negativos-negativos;
    }while(reinicio == 's');
    }
}