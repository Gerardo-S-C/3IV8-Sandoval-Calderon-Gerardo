/*ELABORA UN PROGRAMA QUE CONVIERTA TEMPERATURA EN GRADOS FAHRENHEIT, EN GRADOS CELSIUS, KELVINE Y RANKINE. 
SE PODRA ELEGIR QUE CONVERSION DESEA REALIZAR) */
import java.util.Scanner;

class temperatura{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double temperatura, Fahrenheit, Celsius, Kelvine, Rankine;
        char reinicio;
        int inicio;
        do{
        System.out.println("Ingrese el tipo de temperatura que va a convertir: ");
        System.out.println("1.- Fahrenheit");
        System.out.println("2.-Celsius");
        System.out.println("3.- Kelvine");
        System.out.println("4.- Rankine");
        System.out.println("0.- Salir");
        inicio = entrada.nextInt();

        switch (inicio) {
            case 1:
                System.out.println("Ingrese la temperatura a convertir");
                temperatura = entrada.nextDouble();
                Celsius= (temperatura-32)*5/9;
                Kelvine= (temperatura-32)*5/9 +273.15;
                Rankine= (temperatura-32) +491.67;
                System.out.println("La temperatura en Celsius es: "+Celsius);
                System.out.println("La temperatura en Kelvine es: "+Kelvine);
                System.out.println("La temperatura en Rankine es: "+Rankine);
                break;
            case 2:
                System.out.println("Ingrese la temperatura a convertir");
                temperatura = entrada.nextDouble();
                Fahrenheit= (temperatura-32)*9/5;
                Kelvine= temperatura +273.15;
                Rankine= temperatura*9/5 +491.67;
                System.out.println("La temperatura en Fahrenheit es: "+Fahrenheit);
                System.out.println("La temperatura en Kelvine es: "+Kelvine);
                System.out.println("La temperatura en Rankine es: "+Rankine);
                break;
            case 3:
                System.out.println("Ingrese la temperatura a convertir");
                temperatura = entrada.nextDouble();
                Celsius= temperatura -273.15;
                Fahrenheit= (temperatura -273.15)*9/5 +32;
                Rankine= (temperatura -273.15)*9/5 +491.67;
                System.out.println("La temperatura en Celsius es: "+Celsius);
                System.out.println("La temperatura en Fahrenheit es: "+Fahrenheit);
                System.out.println("La temperatura en Rankine es: "+Rankine);
                break;
            case 4:
                System.out.println("Ingrese la temperatura a convertir");
                temperatura = entrada.nextDouble();
                Celsius= (temperatura-491.67)/9/5;
                Kelvine= (temperatura-491.67)/9/5 +273.15;
                Fahrenheit= temperatura-491.67+32;
                System.out.println("La temperatura en Celsius es: "+Celsius);
                System.out.println("La temperatura en Kelvine es: "+Kelvine);
                System.out.println("La temperatura en Fahrenheit es: "+Fahrenheit);
                break;
            default:
            System.out.println("Vuelva pronto");
                
                break;
        }
        System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
        reinicio = entrada.next().charAt(0);
    }while(reinicio == 's');        
    }
}