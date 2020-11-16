/*ESCRIBA UN PROGRAMA  QUE MUESTRE LA SIGUIENTE TABLA DE VALORES*/
import java.util.Scanner;

class tabla{
    public static void main(String[] args){
        char reinicio;
        do{
        Scanner entrada = new Scanner(System.in);
        System.out.println("La siguiente tabla representa valores del 1 al 10 multiplicados por 10, 100 y 1000 respectivamente");
        System.out.printf("N \t 10 \t 100 \t 1000\n");
        System.out.printf("1 \t 10 \t 100 \t 1000\n");
        System.out.printf("2 \t 20 \t 200 \t 2000\n");
        System.out.printf("3 \t 30 \t 300 \t 3000\n");
        System.out.printf("4 \t 40 \t 400 \t 4000\n");
        System.out.printf("5 \t 50 \t 500 \t 5000\n");
        System.out.printf("6 \t 60 \t 600 \t 6000\n");
        System.out.printf("7 \t 70 \t 700 \t 7000\n");
        System.out.printf("8 \t 80 \t 800 \t 8000\n");
        System.out.printf("9 \t 90 \t 900 \t 9000\n");
        System.out.printf("10 \t 100 \t 1000\t 10000\n");
    System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
}
}