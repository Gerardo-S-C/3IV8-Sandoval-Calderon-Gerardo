/*ELABORA UN PROGRAMA PARA CONVERTIR UN NÚMERO DECIMAL N DADO POR TECLADO A BINARIO.*/
 
import java.util.Scanner;

class binario{
    public static void main(String[] args){ 
    Scanner entrada = new Scanner (System.in);

        //variables
        int decimal;
        char reinicio;
        String bin = ""; //El string se usa en este caso para juntar los "1" y "0" que se van a crear de manera que estos no se terminen sumando o realizando alguna operacion innecesaria
        do{
        System.out.println("Ingrese un numero decimal");
        decimal = entrada.nextInt();
        if (decimal > 0 ){
            while (decimal > 0){
                if (decimal%2==0){
                    bin = "0"+bin;
                }
                else{
                    bin = "1"+bin;
                }
                decimal= (int) decimal/2;
            }
        }
        else if (decimal == 0){
            bin = "0";
            }
            else{
                bin = "No es posible esta conversion, intente de nuevo";
                }
        System.out.println("El numero en binario es: " +bin);
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
    }
}