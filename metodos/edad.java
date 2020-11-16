/*REALIZAR UN PROGRAMA QUE CALCULA LA EDAD DE UNA PERSONA, EL PROGRAMA DEBERA CONTENER UNA CLASE DONDE SE INDIQUEN LAS VARIABLES DE INSTANCIA, 
DEBERA EXISTIR UN METODO DONDE SE PIDAN LOS DATOS DE LA PERSONA  Y OTRO METODO PARA CALCULAR LA EDAD DE LA PERSONA. */
//Pide fecha de nacimiento (entre otros posibles datos) y en base a eso se calcula la edad

//Creado por Gerardo Sandoval Sandoval 3IV8
import java.util.Scanner;
import javax.swing.JOptionPane;

class edad{
    Scanner entrada=new Scanner(System.in);
    private int dia,mes,anio,ed,xd,fil;//variables privadas

    public void datos(){//metodo
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.print("Dia: ");
        dia=entrada.nextInt();
        System.out.print("Mes: ");
        mes=entrada.nextInt();
        System.out.print("Año: ");
        anio=entrada.nextInt();
        edadeh(ed);
        if (mes==1 && dia>31 || dia<=0 || mes==3 && dia>31 || dia<=0 || mes==5 && dia>31 || dia<=0 || mes==7 && dia>31 || dia<=0 || mes==8 && dia>31 || dia<=0 || mes==10&& dia>31 || dia<=0 || mes==12 && dia>31 || dia<=0){
         //estos meses tienen 31 dias, si la variable dias excede el numero 31 o son valores inexistentes, no regresa nada
        System.out.println("La fecha es invalida, ingrese datos validos");
        }
        else if (mes==4 && dia>30||dia<=0 ||mes==6 && dia>30||dia<=0 ||mes==9 && dia>30||dia<=0 ||mes==11 && dia>30||dia<=0 ){
        System.out.println("La fecha es invalida, ingrese datos validos");
        }
        else if(mes==2 && dia>29 && dia<=0){
        System.out.println("La fecha es invalida, ingrese datos validos");
        }
    }
    private int edadeh(int ed){//variable a retornar ed
        int xd=0;
        if(mes>11){
            xd=2019-anio;
            System.out.println("Su edad es de: "+xd+" anios");
        }
        else if(mes<=11){
            xd=2020-anio;
            System.out.println("Su edad es de: "+xd+" anios");
        }
        if(xd>=100){
            System.out.println("Dudo que usted tenga mas de 100 anios aca");
        }
        else if(xd<=0){
            System.out.println("Dudo que usted tenga menos de 0 anios");
        }
        return (ed);
    }
}