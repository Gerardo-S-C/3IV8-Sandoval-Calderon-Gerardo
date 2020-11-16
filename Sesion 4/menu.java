//Este es el menu principal solicitado con todos los programas incluidos uno por uno de manera que estos se ejecuten en este mismo codigo
import java.util.Scanner;

class menu{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        char REINICIO;
        int iniciador;
        //variables decuento
        int edad;
        double precio,abono;
        char opcion,reinicio;
        //variables temperatura
        double temperatura, Fahrenheit, Celsius, Kelvine, Rankine;
        int inicio;
        //variables binario
        int decimal;
        String bin="";
        //variables serienumeros
        int num10, positivos, negativos,p1,n1;
        positivos=0;
        negativos=0;
        char num20;
        //variables cantidades
        int cantidad,a1,a2,a4,a5,a6;
        double num,a3,total,dinero,cambio;
        total=0;
        a1=15; a2=12; a3=1.40; a4=12; a5=10; a6=12;
        //variables areas
        int base, altura, opcion2;
        double resultado1, resultado2;
        //variables tabla
        //no hay, solo el reinicio
        //variables factorial
        int num0,factorial;
        //variables calculadora
        int num3;
        double num1, num2, resultado;
        do{

            System.out.println("3IV8 Sandoval Calderón Gerardo");
            System.out.println("Ingrese la accion que desea realizar");
            System.out.println("1.-Descuentos");
            System.out.println("2.-Temperaturas");
            System.out.println("3.-Binario");
            System.out.println("4.-Serie numerica");
            System.out.println("5.-Tienda");
            System.out.println("6.-Areas y volumenes");
            System.out.println("7.-Tabla");
            System.out.println("8.-Factoriales");
            System.out.println("9.-Calculadora de 2 digitos");
            System.out.println("0.-Salir");
            iniciador=entrada.nextInt();
            switch (iniciador){
                case 1:
                do{
                    System.out.println("Introduzca el abono a descontar:");
                    abono = entrada.nextInt();
                    System.out.println("Introduzca su edad:");
                    edad = entrada.nextInt();
                        if (edad>65){
                        precio = abono*0.6;
                        System.out.println("El abono con descuento es de: "+precio);
                        }
                        else if (edad<65 && edad>21){
                        System.out.println("Sus padres son socios? s/n (escriba su respuesta con letras minusculas)");
                        opcion = entrada.next().charAt(0);
                            switch (opcion) {
                            case 's':
                                precio = abono*0.55;
                                System.out.println("El abono con descuento es de: "+precio);
                                break;
                            case 'n':
                                precio = abono*0.75;
                                System.out.println("El abono con descuento es de: "+precio);
                                break;
                            default:
                            System.out.println("No ingreso una respuesta valida, intentelo de nuevo");
                            break;
                            }
                    }    
                    else{
                        System.out.println("No puede realizar esta accion, debe ser mayor de 21 años");
                    }
                    System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
                    reinicio = entrada.next().charAt(0);
                }while(reinicio == 's');
                    break;
                case 2:
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
                    break;
                case 3:
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
                    break;
                case 4:
                do{
                    System.out.println("Introduzca una serie de numeros cualesquiera, para detenerse ingrese un valor mayor a 10000 o menor a -10000 (de lo contrario, el programa seguira ejecutandose):");
                    do{
                    num10= entrada.nextInt();
                    
                        if (num10>=0){
                            p1=positivos;
                            positivos=1+p1;
                        }
                        else if (num10<0){
                            n1=negativos;
                            negativos=1+n1;
                        }
                        System.out.print("Hay " +positivos);System.out.print(" numeros positivos");
                        System.out.println("");
                        System.out.print("Y hay " +negativos);System.out.print(" numeros negarivos");
                        System.out.println("");
                    }while (num10<10001 && num10>-10001);
                    System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
                    reinicio = entrada.next().charAt(0);
                    positivos=positivos-positivos;
                    negativos=negativos-negativos;
                }while(reinicio == 's');
                    break;
                case 5:
                do{
                    System.out.println("Ingrese las cantidades que desea registrar");
                    cantidad=entrada.nextInt();
                    if (cantidad<=0){
                        System.out.println("Si no va a comprar o viene a vender como ambulante, aqui no es el lugar");
                    }
                    else if(cantidad>0){
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
                }
                    System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
                    reinicio = entrada.next().charAt(0);
                }while(reinicio == 's');
                    break;
                case 6:
                do{
                    System.out.println("Elija la operacion a realizar: ");
                    System.out.println("1.- Calcular el area y perimetro de un rectangulo");
                    System.out.println("2.- Calcular el area y perimetro de un triangulo");
                    System.out.println("3.- Calcular el volumen de una esfera");
                    System.out.println("4.- Calcular el volumen de un cilindro");
                    System.out.println("0.- Salir");
                    opcion2 = entrada.nextInt();
                    switch (opcion2) {
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
                    break;
                case 7:
                do{
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
                    break;
                case 8:
                do{
                    factorial=1;
                    System.out.println("Ingrese un numero entero NO negativo: ");
                    num0=entrada.nextInt();
                    do{
                    factorial=factorial*num0;
                    num0=num0-1;
                    }while(num0>0);
                    System.out.println("El factorial del numero ingresado es "+factorial);
                    System.out.println("Desea repetir el programa? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
                    reinicio = entrada.next().charAt(0);
                }while(reinicio == 's');
                    break;
                case 9:
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
                    break;
                default:
                System.out.println("Entendible, tenga un buen dia [-]^)");
                    break;
            }
            System.out.println("Desea repetir el menu? Si es asi ingrese una s, de lo contrario ingrese cualquier otra tecla");
            REINICIO = entrada.next().charAt(0);
        }while(REINICIO=='s');
    }
}