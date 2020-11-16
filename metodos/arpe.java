/*REALIZAR UN PROGRAMA QUE CALCULE EL AREA Y PERIMETRO DE UN CIRCULO, RECTANGULO, CUADRADO Y TRIANGULO, 
EL PROGRAMA DEBERA CONTENER UNA CLASE DONDE SE INDIQUEN LAS VARIABLES DE INSTANCIA, 
DEBERAN EXISTIR LOS METODOS DONDE SE CALCULEN EL AREA Y EL PERIMETRO PARA CADA FIGURA.*/
//Se piden los datos de la figura en un metodo de una clase y en base a eso se resuelven con otros dos metodos a llamar con las operaciones correspondientes para que se resuelva con eso

//Creado por Gerardo Sandoval Sandoval 3IV8
import java.util.Scanner;

class arpe{
    Scanner entrada=new Scanner(System.in);
    //variables
    private int decision,xdes;
    private double x,res1,res2;
    private double r,b,h,l1,l2,l3;
    public void menu(){
        System.out.println("Ingrese la figura a calcular: ");
        System.out.println("1.- Circulo");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Cuadrado");
        System.out.println("4.- Triangulo");
        System.out.println("0.- Salir");
        decision=entrada.nextInt();
        switch (decision) {
            case 1:
            System.out.println("Ingrese lo datos necesarios: ");
                cir(x);
                break;
            case 2:
            System.out.println("Ingrese lo datos necesarios: ");
            rec(x);
                break;
            case 3:
            System.out.println("Ingrese lo datos necesarios: ");
            cua(x);
                break;
            case 4:
            System.out.println("Ingrese lo datos necesarios: ");
            tri(x);
                break;
            default:
                break;
        }      
}
    private double cir(double x){
        //double res=0;
        System.out.print("radio:");
        r=entrada.nextDouble();
        res1=3.1415*(r*r);
        System.out.println("El area es: "+res1);
        res2=2*3.1416*r;
        System.out.println("El perimetro es: "+res2);
        return (x);
    }
    private double rec(double x){
        //double res=0;
        System.out.print("base:");
        h=entrada.nextDouble();
        System.out.print("altura:");
        b=entrada.nextDouble();
        res1=h*b;
        System.out.println("El area es: "+res1);
        res2=(2*b)+(2*h);
        System.out.println("El perimetro es: "+res2);
        return(x);
    }
    private double cua(double x){
        //double res=0;
        System.out.print("base:");
        h=entrada.nextDouble();
        res1=h*h;
        System.out.println("El area es: "+res1);
        res2=h*4;
        System.out.println("El perimetro es: "+res2);
        return(x);
    }
    private double tri(double x){
        //double res=0;
        System.out.print("base:");
        l1=entrada.nextDouble();
        System.out.print("lado2:");
        l2=entrada.nextDouble();
        System.out.print("lado3:");
        l3=entrada.nextDouble();
        System.out.print("altura:");
        h=entrada.nextDouble();
        res1=(b*h)/2;
        System.out.println("El area es: "+res1);
        res2=b+h+r;
        System.out.println("El perimetro es: "+res2);
        return(x);
    }
}