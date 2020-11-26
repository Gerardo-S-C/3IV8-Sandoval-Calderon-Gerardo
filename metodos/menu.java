//menu de los tres problemas

//Creado por Gerardo Sandoval Sandoval 3IV8
import java.util.*;
import javax.swing.JOptionPane;
public class menu{
    public void macaco() {
        Scanner entrada=new Scanner(System.in);
        int jaja;
        edad p1 = new edad();
        arpe p2 = new arpe();
        saldo p3 = new saldo();
        do{
            String ax = JOptionPane.showInputDialog("\t3IV8 SANDOVAL CALDERON GERARDO\t\nEscoja lo que desea realizar: \n1.-Calcular edad\n2.-Areas y perimetros\n3.-Saldo\n0.-SALIR");
        switch (ax) {
            case "1":
            p1.datos();
                break;
            case "2":
            p2.menu();
                break;
            case "3":
            p3.total();
                break;
            default:
                break;
        }
        int input = JOptionPane.showConfirmDialog(null, "Quiere repetir?", "o__o",JOptionPane.YES_NO_OPTION);
                //System.out.println(input);
    }while (true);
    }
}