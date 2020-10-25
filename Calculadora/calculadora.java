import java.util.Scanner;

class calculadora{
    /*Se va a crear un programa que cumpla las funciones basicas de una calculadora
    */

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        //variables
        int num1, num2, num3, resultado;

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
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                resultado = num1 + num2;

                System.out.println("El resultado de su suma es: "+resultado);
                
                break;
            case 2:
                System.out.println("Ingrese 2 valores a restar: ");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                resultado = num1 - num2;

                System.out.println("El resultado de su resta es: "+resultado);
                break;
            case 3:
                System.out.println("Ingrese 2 valores a multiplicar: ");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                resultado = num1 * num2;

                System.out.println("El resultado de su multiplicacion es: " +resultado);
                break;
            case 4:
                System.out.println("Ingrese 2 valores a dividir: ");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                resultado = num1 / num2;

                System.out.println("El resultado de su division es: " +resultado);
                break;
            default:
                System.out.println("Nos vemos");
                break;
        }
    }

}