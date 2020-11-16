/*ELABORA UN PROGRAMA QUE LEA CANTIDADES (PERMITIR AL USUARIO PREGUNTAR CUANTAS CANTIDADES DESEA INGRESAR)
LOS PRECIOS Y LOS PRODUCTOS YA ESTAN DEFINIDOS Y AL FINAL QUE MUESTRE EL TOTAL DE LOS PRODUCTOS COMPRADOS Y SU FACTURA TOTAL. */
import java.util.Scanner;

class cantidades{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        //variables
        int cantidad,a1,a2,a4,a5,a6;
        double num,a3,total,dinero,cambio;
        char reinicio;
        total=0;
        a1=15; a2=12; a3=1.40; a4=12; a5=10; a6=12;
        do{
        System.out.println("Ingrese las cantidades que desea ingresar");
        cantidad=entrada.nextInt();
        if (cantidad<=0){
            System.out.println("Si no va a comprar o viene a vender como ambulante, aqui no es el lugar");
        }
        System.out.println("Escoja los productos que registrara: ");
        System.out.printf("1.- cocacola 250ml => $15 \t\t 2.- papas => $12 \n3.- chicle de a peso => $1.40 \t\t 4.- agua n o r m a l => $12 \n5.- panditas => $10 \t\t\t 6.- pepsicul => $12\n");
        do{
            num=entrada.nextDouble();
            if (num==1){
                total= a1+total;
            }
            else if (num==2){
                total= a2+total;
            }
            else if (num==3){
                total= a3+total;
            }
            else if (num==4){
                total= a4+total;
            }
            else if (num==5){
                total= a5+total;
            }
            else if (num==6){
                total= a6+total;
            }
            cantidad=cantidad-1;
        }while(cantidad>0);
        System.out.println("El precio total a pagar es de: "+total);
        System.out.println("Ingrese el dinero con el que pagara: ");
        dinero=entrada.nextDouble();
        if (dinero<=0 || dinero<total){
            System.out.println("Le falta dinero para comprar estos productos, vayase porfavor y deje todo en la caja");
        }
        else{
            cambio=dinero-total;
            System.out.println("Pago con $"+dinero);
            System.out.println("Su cambio es de "+cambio);
            System.out.println("Gracias por su compra");
        }
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
    }
}