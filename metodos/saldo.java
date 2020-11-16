/*REALIZAR UN PROGRAMA QUE CALCULE EL COSTO DE LLAMADAS TELEFONICAS CELULARES, 
DEBERA CONTENER LAS SIGUIENTES VARIABLES: 
NUMERO DE CELULAR (INT)
CREDITO(INT) 
Y MEDIANTE UN METODO SE PODRA CALCULAR EL COSTO TOTAL DE LLAMADAS: 
LOCALES NACIONALES($0.5)
LOCALESINTERNACIONALES($0.6)
Y CELULARES ($0.2) 
Y SE DEBERA IR DESCONTANDO DEL CREDITO LAS LLAMADAS REALIZADAS
TAMBIEN EXISTIRA UNA OPCION Y METODO PARA PODER INGRESAR Y CONSULTAR EL CREDITO.*/
//En las instrucciones esta mas que claro

//Creado por Gerardo Sandoval Sandoval 3IV8
import java.util.Scanner;
import java.util.Random;

class saldo{
    Scanner entrada=new Scanner(System.in);
    private int ncel,celx,random,op,xy,ing;//el numero de celular varia para hacer uso de esa variable que solicitan en el problema. fin
    private int cred=20; //credito base
    private double x;
    private double ln=0.5;
    private double lin=0.6; 
    private double cel=0.2;//variables
    public void total(){
        System.out.println("Que desea hacer? ");
        System.out.println("1.- Hacer una llamada dentro de la republica");
        System.out.println("2.- Hacer una llamada fuera de la republica");
        System.out.println("3.- Hacer una llamada fuera de celular");
        System.out.println("4.- Ingresar saldo/consultar saldo");
        System.out.println("0.- Salir");
        op=entrada.nextInt();
        switch (op) {
            case 1:
            llamada1();
                break;
            case 2:
            llamada2();
            case 3:
            llamada3();
                break;
            case 4:
            saldo(xy);
                break;
            default:
                break;
        }
    }
    private void llamada1(){
        System.out.print("Su numero de celular es: 55 ");
        ncel=entrada.nextInt();
        System.out.print("Marque el numero a llamar: 55 ");
        celx=entrada.nextInt();
        local(x);

        //System.out.print("El tiempo de la llamada fue de: "+min+" min. Su saldo es de: "+cred);
    }
    private void llamada2(){
        System.out.print("Su numero de celular es: 55 ");
        ncel=entrada.nextInt();
        System.out.print("Marque el numero a llamar: ");
        celx=entrada.nextInt();
        internac(x);
        //System.out.print("El tiempo de la llamada fue de: "+min+" min. Su saldo es de: "+cred);
    }
    private void llamada3(){
        System.out.print("Su numero de celular es: 55 ");
        ncel=entrada.nextInt();
        System.out.print("Marque el numero a llamar: ");
        celx=entrada.nextInt();
        celu(x);
        //System.out.print("El tiempo de la llamada fue de: "+min+" min. Su saldo es de: "+cred);
    }
    private double rand(double random){
        random=(int)(Math.random() * 20 )+1;//tiempo random de llamada
        System.out.println("Su tiempo fue de: "+random);
        return(random);
    }
    private double local(double x){
        double result=0;
        //System.out.println(""+rand(random));
        //llamada en la republica
        result=cred-(rand(random)*lin);
        System.out.println("El saldo que le resta es de: "+result);
        return (x);
    }
    private double internac(double x){
        double result=0;
        //System.out.println(""+rand(random));
        //llamada en la republica
        result=cred-(rand(random)*ln);
        System.out.println("El saldo que le resta es de: "+result);
        return (x);
    }
    private double celu(double x){
        double result=0;
        //System.out.println(""+rand(random));
        //llamada en la republica
        result=cred-(rand(random)*cel);
        System.out.println("El saldo que le resta es de: "+result);
        return (x);
    }
    private int saldo(int xy){
        int ncel=0;
        int ing=0;
        System.out.println("Su saldo actual es de: "+cred);
        System.out.println("Desea ingresar mas saldo?");
        System.out.print("1.- Si \t 2.- No");//en la interfaz sera con botones espero
        ncel=entrada.nextInt();
        if(ncel==1){
            System.out.println("Cuanto quiere ingresar? ");
            ing=entrada.nextInt();
            cred+=ing;
            System.out.println("Su saldo total entonces es de: "+cred);
        }
        else{
            System.out.println("Ok, almenos checo su saldo, bai");
        }
        return(xy);
    }
}