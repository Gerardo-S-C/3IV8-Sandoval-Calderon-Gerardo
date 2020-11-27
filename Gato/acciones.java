//aca es donde se ingresara el numero del recuadro para insertar una X o una O
//dependiendo los turnos
import java.util.*;

public class acciones extends variables{
    Scanner entrada = new Scanner(System.in);
    //variables propias
    private int x;
    private int z;
    public acciones(){

    }


    public acciones(int num,String[][]y,int z){///mas variables??
        super (num,y);
        this.x=x;
        this.z=z;
    }

    public void camcuad(){
        System.out.println("Jugador 1=X \nJugador 2=O\nListos? Vamos a ver que tal");
        try{
            do{
        System.out.println("J1, escoja la casilla en la que quiera tirar va? orale va(X) ");
        num= entrada.nextInt();
        lectura();
        //condicionesX();
        System.out.println("J2, escoja la casilla en la que quiera tirar va? orale va(O) ");
        x= entrada.nextInt();
        lectura();
        ganadorFilaX();
        ganadorFilaY();
        //condicionesY();
            }while(z==0);//hasta que haya un ganador o se termine en gato
        }catch(Exception e){System.out.println("El error es: "+e+"\nSi le entiende al tipo de error que es, no lo vuelva a hacer plox");}
    }
    public void excepcion(){//en caso de que se escoja una casilla llena
        if (num==x){
            System.out.println("Esa casilla ya esta elejida, pierdes turno pq si, jjjj");
        }
        else{
            System.out.println("Van bien :)");
        }
    }
    public void lectura(){
        panel vis=new panel();
        //excepcionX();
            if (num==1&&num!=x){
            y[0][0] = "X";
             }
            else if(num==2&&num!=x){
            y[0][1] = "X";
            }
            else if(num==3&&num!=x){
            y[0][2] = "X";
            }
            else if(num==4&&num!=x){
            y[1][0] = "X";
            }
            else if(num==5&&num!=x){
            y[1][1] = "X";
            }
            else if(num==6&&num!=x){
            y[1][2] = "X";
            }
            else if(num==7&&num!=x){
            y[2][0] = "X";
            }
            else if(num==8&&num!=x){
            y[2][1] = "X";
            }
            else if(num==9&&num!=x){
            y[2][2] = "X";
            }
            else{excepcion();
            }
            //excepcionY();
            if (x==1&&num!=x){
                y[0][0] = "O";
                 }
                else if(x==2&&num!=x){
                y[0][1] = "O";
                }
                else if(x==3&&num!=x){
                y[0][2] = "O";
                }
                else if(x==4&&num!=x){
                y[1][0] = "O";
                }
                else if(x==5&&num!=x){
                y[1][1] = "O";
                }
                else if(x==6&&num!=x){
                y[1][2] = "O";
                }
                else if(x==7&&num!=x){
                y[2][0] = "O";
                }
                else if(x==8&&num!=x){
                y[2][1] = "O";
                }
                else if(x==9&&num!=x){
                y[2][2] = "O";
                }
                else{excepcion();
                }
        vis.visualizar(y);

    }
    public void ganadorFilaX(){
            if(y[0][0]=="X"&&y[0][1]=="X"&&y[0][2]=="X"){
                System.out.println("ha ganado J1, bai");
                z=1;
            }
            else if(y[1][0]=="X"&&y[1][1]=="X"&&y[1][2]=="X"){
                System.out.println("ha ganado J1, bai");
                z=1;
            }
            else if(y[2][0]=="X"&&y[2][1]=="X"&&y[2][2]=="X"){
                System.out.println("ha ganado J1, bai");
                z=1;
            }
            else{
                ganadorColumnaX();
            }
        }
    public void ganadorColumnaX(){
        if(y[0][0]=="X"&&y[1][0]=="X"&&y[2][0]=="X"){
            System.out.println("ha ganado J1, bai");
            z=1;
        }
        else if(y[0][1]=="X"&&y[1][1]=="X"&&y[2][1]=="X"){
            System.out.println("ha ganado J1, bai");
            z=1;
        }
        else if(y[0][2]=="X"&&y[1][2]=="X"&&y[2][2]=="X"){
            System.out.println("ha ganado J1, bai");
            z=1;
        }
        else{
            ganadorDiagX();
        }
    }
    public void ganadorDiagX(){
        if(y[0][0]=="X"&&y[1][1]=="X"&&y[2][2]=="X"){
        System.out.println("ha ganado J1, bai");
        z=1;
        }
        else if(y[0][2]=="X"&&y[1][1]=="X"&&y[2][0]=="X"){
        System.out.println("ha ganado J1, bai");
        z=1;
        }
        else{
            System.out.println("No ha ganado J1 :(");
        }
    }
    public void ganadorFilaY(){
        if(y[0][0]=="O"&&y[0][1]=="O"&&y[0][2]=="O"){
            System.out.println("ha ganado J2, bai");
            z=1;
        }
        else if(y[1][0]=="O"&&y[1][1]=="O"&&y[1][2]=="O"){
            System.out.println("ha ganado J2, bai");
            z=1;
        }
        else if(y[2][0]=="O"&&y[2][1]=="O"&&y[2][2]=="O"){
            System.out.println("ha ganado J2, bai");
            z=1;
        }
        else{
            ganadorColumnaY();
        }
    }
public void ganadorColumnaY(){
    if(y[0][0]=="O"&&y[1][0]=="O"&&y[2][0]=="O"){
        System.out.println("ha ganado J2, bai");
        z=1;
    }
    else if(y[0][1]=="O"&&y[1][1]=="O"&&y[2][1]=="O"){
        System.out.println("ha ganado J2, bai");
        z=1;
    }
    else if(y[0][2]=="O"&&y[1][2]=="O"&&y[2][2]=="O"){
        System.out.println("ha ganado J2, bai");
        z=1;
    }
    else{
        ganadorDiagY();
    }
}
public void ganadorDiagY(){
    if(y[0][0]=="O"&&y[1][1]=="O"&&y[2][2]=="O"){
    System.out.println("ha ganado J2, bai");
    z=1;
    }
    else if(y[0][2]=="O"&&y[1][1]=="O"&&y[2][0]=="O"){
    System.out.println("ha ganado J2, bai");
    z=1;
    }
    else{
        System.out.println("No ha ganado J2 :(");
    }
}
    //geters y seters
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z=z;
    }
}
