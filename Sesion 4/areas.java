/*ELABORA UN PROGRAMA QUE REALICE 
A. EL AREA  Y PERIMETRO DE UN RECTANGULO
B. EL PERIMETRO Y AREA DE UN TRIANGULO
C. EL VOLUMEN DE UNA ESFERA Y VOLUMEN DE UN CILINDRO*/
import java.util.Scanner;
class areas{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion;
        char reinicio;
        double resultado1, resultado2;
    do{
        System.out.println("Elija la operacion a realizar: ");
        System.out.println("1.- Calcular el area y perimetro de un rectangulo");
        System.out.println("2.- Calcular el area y perimetro de un triangulo");
        System.out.println("3.- Calcular el volumen de una esfera");
        System.out.println("4.- Calcular el volumen de un cilindro");
        System.out.println("0.- Salir");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el valor del lado: ");
                base= entrada.nextInt();
                System.out.println("Ingresa el valor de la altura: ");
                altura= entrada.nextInt();
                resultado1 = base*altura;
                resultado2 = base*2 + 2*altura;
                System.out.println("El area es: "+resultado1);
                System.out.println("El perimetro es: "+resultado2);
                break;
            case 2:
                System.out.println("Ingresa el valor del lado: ");
                base= entrada.nextInt();
                System.out.println("Ingresa el valor de la altura: ");
                altura= entrada.nextInt();
                resultado1 = (base*altura)/2;
                resultado2 = 3*base;
                System.out.println("El area es de: "+resultado1);
                System.out.println("El perimetro es de: "+resultado2);
                System.out.println("Tomando en cuenta que es un triangulo equilatero");
                break;
            case 3:
                System.out.println("Ingrese el valor del radio: ");
                base= entrada.nextInt();
                resultado1= (base*base*base*4*3.1416)/3;
                System.out.println("El volumen es de: "+resultado1);
                break;
            case 4:
                System.out.println("Ingrese el valor del radio");
                base= entrada.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura= entrada.nextInt();
                resultado1= 3.1416*(base*base)*altura;
                System.out.println("El volumen es de: "+resultado1);
            default:
                System.out.println("Gracias por participar ");  
        }
        System.out.println("Deseas repetir el programa?, si lo desea escriba s");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');
    }
}