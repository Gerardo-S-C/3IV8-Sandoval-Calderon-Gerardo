/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;
import javax.swing.JButton;
/**
 *
 * @author illum
 */
public class Cuadro extends JButton {
    private boolean mina;
    
    public Cuadro(){
        super();
        double random=Math.random();
        if (random>0.7){
            mina=true;        
        }
        else{
            mina=false;
        }
    }
    public boolean Minado(){
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }
}
