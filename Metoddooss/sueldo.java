/*REALIZAR  UN PROGRAMA QUE CALCULE EL SUELDO DE UN EMPLEADO
LAS VARIABLES DE INSTANCIA SON:  
ID_EMPLEADO 
NOMBRE DEL EMPLEADO (CADENA)
PUESTO (CADENA)
SUELDO_QUINCENAL (ARREGLO UNIDIMENSIONAL). 
ELABORAR UN METODO QUE ACEPTE LOS DATOS INDICADOS SOLO SI CORRESPONDE CON EL PUESTO Y EL IDENTIFICADOR DEL EMPLEADO. 
ELABORAR OTRO METODO PARA CALCULAR EL TOTAL DE PAGO SEGUN LO SIGUIENTE: 
PARA EMPLEADOS SE CALCULARA EL SUELDO QUINCENAL (5000)+ HORAS EXTRAS DIURNAS ($50) Y HORAS EXTRAS NOCTURNAS ($60). 
PARA EMPLEADOS SUPERVISORES SE CALCULARA SUELDO QUINCENAL (8000)-0.2% INFONAVIT -0.1%SEGURO DE GASTOS MEDICOS – 0.16%ISR. */

import java.util.Scanner;
import javax.swing.*;

public class sueldo{
    private int id,x;
    private double y;
    private char nemp, puesto;
    private int[] sueldo= new int[1]; 
    public void salida(){
        datos();
    }
    private void datos(){
        String o=JOptionPane.showInputDialog("Ingrese su ID: ");
        //JOptionPane.showMessageDialog(null, "Usted ingreso: "+o);
        Object []u={"Empleado", "Supervisor"};//0 y 1 respectivamente
        int id= JOptionPane.showOptionDialog (null, "Usted es...?", "Ojo cuidao", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, u, null);
        //JOptionPane.showMessageDialog(null, "Usted ingreso: "+id);
        if(id==0){
            pagoempleado(sueldo);
        }
        else if(id==1){
            pagosupervisor(sueldo);
        }
        
    }
    private int[] pagoempleado(int[]sueldo){
        int o2=0;
        int u2=0;
        int o=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras diurnas trabajadas "));
        int u=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras nocturnas trabajadas "));
        //JOptionPane.showMessageDialog(null, "Usted ingreso: "+o);
        //x=total
        if(o>0){
            o2=o*50;
        }
        else{}
        if(u>0){
            u2=u*60;
        }
        else{}
        x=5000+o2+u2;
        JOptionPane.showMessageDialog(null, "Su sueldo total es de: "+x);
        return sueldo;
    }
    private int[] pagosupervisor(int[]sueldo){
        /*int o2=0;
        int u2=0;
        int o=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras diurnas trabajadas "));
        int u=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras nocturnas trabajadas "));
        //JOptionPane.showMessageDialog(null, "Usted ingreso: "+o);
        //x=total
        if(o>0){
            o2=o*50;
        }
        else{}
        if(u>0){
            u2=u*60;
        }
        else{}*/
        y=8000-(8000*0.2)-(8000*0.1)-(8000*0.16);
        JOptionPane.showMessageDialog(null, "Su sueldo total es de: "+y+" \nPor los impuestos y eso\n que te sorprende? jjj");
        return sueldo;
    }
}
