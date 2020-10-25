import java.util.Scanner;

class convercionunidades{
    public static void main(String[] args){ 
    Scanner entrada = new Scanner (System.in);

    int velocidad, distancia, peso, opcion;
    double resultado, resultado2;
    char condicion;

    System.out.println("Sobre que desea sacar convercion?");
    System.out.println("1.- Longitud");
    System.out.println("2.- Peso");
    System.out.println("3.- Velocidad");
    System.out.println("0.- Salir");

    opcion = entrada.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("Escoga la unidad a convertir: ");
            System.out.println("a.- metro");
            System.out.println("b.- centimetro");
            System.out.println("c.- pulgada");
            System.out.println("x.- salir");
            condicion = entrada.next().charAt(0);
            switch (condicion) {
                case 'a':
                    System.out.println("Ingresa el valor a convertir: ");
                    distancia = entrada.nextInt();
                    resultado = distancia*100;  //centimetros
                    resultado2 = distancia*39.37;       //pulgada
                    System.out.print("El valor de "+distancia); System.out.print(" En cm es "+resultado);System.out.print(". Y en pulgadas es de "+resultado2);
                    System.out.println("");
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
                case 'b':
                    System.out.println("Ingresa el valor a convertir: ");
                    distancia = entrada.nextInt();
                    resultado = distancia/100;  //metros
                    resultado2 = distancia*0.3937;  //pulgadas
                    System.out.print("El valor de "+distancia); System.out.print(" En m es "+resultado);System.out.print(". Y en pulgadas es de "+resultado2);
                    System.out.println("");
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                case 'c':
                    System.out.println("Ingresa el valor a convertir: ");
                    distancia = entrada.nextInt();
                    resultado = distancia*0.0254;   //metros   
                    resultado2 = distancia*2.54;        //centimetros
                    System.out.print("El valor de "+distancia); System.out.print(" En m es "+resultado);System.out.print(". Y en cm es de "+resultado2);
                    System.out.println("");
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                default:
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
            }

        break;
        case 2:
            System.out.println("Escoga la unidad a convertir: ");
            System.out.println("d.- kilogramos");
            System.out.println("e.- libras");
            System.out.println("f.- gramos");
            System.out.println("x.- salir");
            condicion = entrada.next().charAt(0);
            switch (condicion) {
                case 'd':
                    System.out.println("Ingresa el valor a convertir: ");
                    peso = entrada.nextInt();
                    resultado = peso*2.2046;   //libras
                    resultado2 = peso*1000;     //gramos
                    System.out.print("El valor de "+peso); System.out.print(" En lb es "+resultado);System.out.print(". Y en gramos es de "+resultado2);
                    System.out.println("");
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
                case 'e':
                    System.out.println("Ingresa el valor a convertir: ");
                    peso = entrada.nextInt();
                    resultado = peso*0.45366;   //kilogramos
                    resultado2 = peso*453.5924;     //gramos
                    System.out.print("El valor de "+peso); System.out.print(" En kg es "+resultado);System.out.print(". Y en gramos es de "+resultado2);
                    System.out.println("");
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
                case 'f':
                    System.out.println("Ingresa el valor a convertir: ");
                    peso = entrada.nextInt();
                    resultado = peso*0.001;  //kilogramos
                    resultado2 = peso*0.0022;     //libras
                    System.out.print("El valor de "+peso); System.out.print(" En kg es "+resultado);System.out.print(". Y en lb es de "+resultado2);
                    System.out.println("");
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                default:
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
            }
        break;
        case 3:
            System.out.println("Escoga la unidad a convertir: ");
            System.out.println("g.- m/s");
            System.out.println("h.- km/h");
            System.out.println("x.- salir");
            condicion = entrada.next().charAt(0);
            switch (condicion) {
                case 'g':
                System.out.println("Ingresa el valor a convertir: ");
                velocidad = entrada.nextInt();
                resultado = velocidad*3.6;
                System.out.print("El valor de "+velocidad); System.out.print(" En km/h es "+resultado);
                System.out.println("");
                System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
                case 'h':
                System.out.println("Ingresa el valor a convertir: ");
                velocidad = entrada.nextInt();
                resultado = velocidad*0.277;
                System.out.print("El valor de "+velocidad); System.out.print(" En m/s es "+resultado);
                System.out.println("");
                System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
                default:
                    System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
                    break;
            }
        break;
        default:
        System.out.println("Gracias por participar, ejecute de nuevo el programa si desea continuar");
        break;
        }


    }
}