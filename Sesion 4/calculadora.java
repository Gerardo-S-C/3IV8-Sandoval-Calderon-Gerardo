/*DESARROLLE UN ALGORITMO QUE PERMITA EL DESARROLLO DE UNA CALCULADORA CONVENCIONAL
CON SUMA RESTA MULTIPLICACION Y DIVISION, DEBERA UN INCLUIR UN MENU DE ENTRADA A LAS OPERACIONES
Y QUE PERMITA ELEGIR ENTRE OTRA OPERACION O SALIR DEL PROGRAMA.
(PUEDE UTILIZAR LIBRERIA SWING CON OPCION JOPTIONPANE INVESTIGACION)*/
//este codigo es el mismo de la actividad de la s3, puesto que piden las mismas caracteristicas ambas instrucciones.
import java.util.Scanner;

class calculadora{
    /*Se va a crear un programa que cumpla las funciones basicas de una calculadora
    */

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        //variables
        int num3;
        double num1, num2, resultado;
        char reinicio;
        do{
        System.out.println("Escoja la operacion a realizar: ");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.println("0.- Salir");

        num3 = entrada.nextInt();

        switch (num3) {
            case 1: 
                System.out.println("Ingrese 2 valores a sumar: ");
                num1 = entrada.nextDouble();
                num2 = entrada.nextDouble();
                resultado = num1 + num2;

                System.out.println("El resultado de su suma es: "+resultado);
                
                break;
            case 2:
                System.out.println("Ingrese 2 valores a restar: ");
                num1 = entrada.nextDouble();
                num2 = entrada.nextDouble();
                resultado = num1 - num2;

                System.out.println("El resultado de su resta es: "+resultado);
                break;
            case 3:
                System.out.println("Ingrese 2 valores a multiplicar: ");
                num1 = entrada.nextDouble();
                num2 = entrada.nextDouble();
                resultado = num1 * num2;

                System.out.println("El resultado de su multiplicacion es: " +resultado);
                break;
            case 4:
                System.out.println("Ingrese 2 valores a dividir: ");
                num1 = entrada.nextDouble();
                num2 = entrada.nextDouble();
                resultado = num1 / num2;

                System.out.println("El resultado de su division es: " +resultado);
                break;
            default:
                System.out.println("Nos vemos");
                break;
        }
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
    }

}